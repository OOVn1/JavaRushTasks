package com.javarush.task.pro.task11.task1129;

/* 
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        Class[] playlist = {new AlternativeMetal().getClass(), new BlackMetal().getClass(), new DeathMetal().getClass(),
                            new DeathMetal().getClass(), new DoomMetal().getClass(), new FolkMetal().getClass(),
                            new GlamMetal().getClass(), new GothicMetal().getClass(), new HeavyMetal().getClass(),
                            new IndustrialMetal().getClass(), new Metalcore().getClass(), new PowerMetal().getClass(),
                            new ProgressiveMetal().getClass(), new SpeedMetal().getClass(), new SymphonicMetal().getClass(),
                            new ThrashMetal().getClass()};
        sysadmin.load(playlist);
    }
}
