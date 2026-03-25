package Oracle2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class NewOracle {
    public void start(Scanner scanner) throws InterruptedException {
        Path path = Paths.get("src\\main\\java\\Oracle2\\TextPrediction", "TextOracle");

        try {
            List<String> text = Files.readAllLines(path);
            System.out.println(text.get(0));
            Thread.sleep(1000);
            System.out.println(text.get(1));
            Thread.sleep(1000);
            System.out.print(text.get(2) + " ");
            String userAnswer = scanner.nextLine().toLowerCase();
            boolean isValid = false;
            while (!isValid) {
                switch (userAnswer) {
                    case "major" -> {

                        System.out.println(text.get(3));
                        Thread.sleep(1000);
                        System.out.println(text.get(4));
                        Thread.sleep(1000);
                        System.out.println(text.get(5));
                        isValid = true;
                        Major major = new Major();
                        scanner.close();
                        System.out.println(major.getMajorCard());
                        System.out.println(major.getAsciiArt());
                        System.out.println(major.getMajorPrediction());
                    }
                    case "all" -> {

                        System.out.println(text.get(3));
                        Thread.sleep(1000);
                        System.out.println(text.get(4));
                        Thread.sleep(1000);
                        System.out.println(text.get(5));
                        isValid = true;
                        All all = new All();
                        scanner.close();
                        System.out.println(all.getAllCard());
                        System.out.println(all.getAsciiArt());
                        System.out.println(all.getAllPrediction());
                    }
                    default -> {
                        System.out.println(text.get(6));
                        System.out.println(text.get(7));
                        System.out.println(text.get(2));
                        scanner = new Scanner(System.in);
                        userAnswer = scanner.nextLine().toLowerCase();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
