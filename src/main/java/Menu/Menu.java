package Menu;

import Oracle2.newOracle;
import org.Oracle.Oracle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu() throws IOException, InterruptedException {
        Path textMenu = Paths.get("src\\main\\java\\Oracle2\\TextPrediction", "Menu");
        List<String> text = Files.readAllLines(textMenu);

        System.out.println(text.get(0));
        System.out.println(text.get(1));
        System.out.println(text.get(2));
        System.out.println(text.get(3));
        System.out.print(text.get(4) + " ");
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();
        boolean isValid = false;
        while (!isValid) {
            switch (userAnswer) {
                case 1 -> {
                    Oracle.Oracle();
                    isValid = true;
                }
                case 2 -> {
                    newOracle.newOracle();
                    isValid = true;
                }
                default -> {
                    System.out.println(text.get(5));
                    scanner = new Scanner(System.in);
                    userAnswer = scanner.nextInt();
                }
            }
        }
    }
}