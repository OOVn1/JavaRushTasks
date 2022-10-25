package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random random = new Random();
        int result = random.nextInt(8);
        String string = null;
        switch (result) {
            case 0: string = CERTAIN;
                break;
            case 1: string = DEFINITELY;
                break;
            case 2: string = MOST_LIKELY;
                break;
            case 3: string = OUTLOOK_GOOD;
                break;
            case 4: string = ASK_AGAIN_LATER;
                break;
            case 5: string = TRY_AGAIN;
                break;
            case 6: string = NO;
                break;
            case 7: string = VERY_DOUBTFUL;
                break;
        }
        return string;
    }
}
