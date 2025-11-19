package org.Oracle;

public class All {
    private final String[] prediction;
    private final int randomise;

    public All() {
        Text text = new Text();
        String[] allCards = text.getAllCards();
        String[] allAnswer = text.getAllAnswer();

        int randomise = (int) (Math.random() * allCards.length);
        this.prediction = new String[]{allCards[randomise], allAnswer[randomise]};
        this.randomise = randomise;
    }

    // Геттеры
    public String[] getPrediction(){
        return prediction;
    }

    public int getRandomise(){
        return randomise;
    }


}