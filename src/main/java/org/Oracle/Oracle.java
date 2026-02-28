package org.Oracle;

import java.util.Scanner;


public class Oracle {
    public static void Oracle() throws InterruptedException {
        System.out.println("И вновь ты пришёл...");
        Thread.sleep(1000);
        System.out.println("Хочешь на старших погадать или на всех?(Major/All)");
        Thread.sleep(1000);
        System.out.print("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();
        boolean isValid = false;
        while (!isValid) {
            switch (userAnswer) {
                case "Major", "major", "MAJOR" -> {
                    System.out.println("Карты услышали тебя...");
                    Thread.sleep(1000);
                    System.out.println("Я начинаю медленно тасовать их...");
                    Thread.sleep(1000);
                    System.out.println("Я вижу результат...");
                    isValid = true;
                    Major prediction = new Major();
                    Ascii ascii = new Ascii();
                    String[] answer = prediction.getPrediction();
                    String[] predictionAscii = ascii.getAscii();
                    int randomise = prediction.getRandomise();
                    System.out.println(predictionAscii[randomise]);
                    System.out.println(answer[0]);
                    System.out.println(answer[1]);
                    System.out.println(answer[2]);
                }
                case "All", "ALL", "all" -> {
                    System.out.println("Карты услышали тебя...");
                    Thread.sleep(1000);
                    System.out.println("Я начинаю медленно тасовать их...");
                    Thread.sleep(1000);
                    System.out.println("Я вижу результат...");
                    isValid = true;
                    All prediction = new All();
                    Ascii ascii = new Ascii();
                    String[] answer = prediction.getPrediction();
                    String[] predictionAscii = ascii.getAscii();
                    int randomise = prediction.getRandomise();
                    System.out.println(predictionAscii[randomise]);
                    System.out.println(answer[0]);
                    System.out.println(answer[1]);
                }
                default -> {
                    System.out.println("Сосредоточься, попробуй снова...");
                    System.out.println("P.S. MAJOR/Major/major или ALL/All/all");
                    System.out.print("Введите текст: ");
                    scanner = new Scanner(System.in);
                    userAnswer = scanner.nextLine();
                }
            }
        }

    }
}