package com.javarush.task.task28.task2802;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/

public class Solution {

    public static void main(String[] args) {
        class EmulatorThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulatorThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulatorThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory{

        private ThreadGroup group;
        private static AtomicInteger factoryNumber = new AtomicInteger(1);
        private AtomicInteger threadNumber = new AtomicInteger(1);
        private String format;

        public AmigoThreadFactory() {
            group = Thread.currentThread().getThreadGroup();
            format = String.format("%s-pool-%s-thread-", group.getName(), factoryNumber.getAndIncrement());
        }

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(group, r, format + threadNumber.getAndIncrement());

            thread.setDaemon(false);
            thread.setPriority(thread.NORM_PRIORITY);

            return thread;
        }
    }
}
