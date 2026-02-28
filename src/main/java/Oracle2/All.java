package Oracle2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class All {
    private final List<String> listOfCards;
    private final List<String> listOfAllPrediction;
    private final List<String> listOfAscii;
    private List<String> asciiArts;
    private final int randomCard;

    Path cards = Paths.get("src\\main\\java\\Oracle2\\TextPrediction", "Cards");
    Path allPrediction = Paths.get("src\\main\\java\\Oracle2\\TextPrediction", "AllPrediction");
    Path ascii = Paths.get("src\\main\\java\\Oracle2\\TextPrediction", "AsciiCards");

    public All() throws IOException {
        this.randomCard = (int) (Math.random() * 78);
        this.listOfCards = Files.readAllLines(cards);
        this.listOfAllPrediction = Files.readAllLines(allPrediction);
        this.listOfAscii = Files.readAllLines(ascii);
    }

    private void loadAsciiArts() {
        if (asciiArts != null) return;
        asciiArts = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (String line : listOfAscii) {
            if (line.isEmpty()) {
                if (!current.isEmpty()) {
                    asciiArts.add(current.toString());
                    current = new StringBuilder();
                }
            } else {
                if (!current.isEmpty()) current.append("\n");
                current.append(line);
            }
        }
        if (!current.isEmpty()) asciiArts.add(current.toString());
    }

    public String getAllCard() {
        return listOfCards.stream()
                .skip(randomCard - 1)
                .findFirst()
                .orElse("Карта не найдена");
    }

    public String getAllPrediction(){
        return listOfAllPrediction.stream()
                .skip(randomCard - 1)
                .findFirst()
                .orElse("Не найдено предсказание");
    }

    public String getAsciiArt() {
        loadAsciiArts();
        return asciiArts.stream()
                .skip(randomCard - 1)
                .findFirst()
                .orElse("Арт не найден");
    }
}
