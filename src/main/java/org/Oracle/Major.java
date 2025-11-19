package org.Oracle;

public class Major {
    private final String[] prediction;
    private final int randomise;

    public Major() {
        Text text = new Text();
        String[] majorCards = text.getMajorCards();
        String[] firstAnswers = text.getFirstMajorAnswer();
        String[] secondAnswers = text.getSecondMajorAnswer();

        int randomise = (int) (Math.random() * majorCards.length);
        this.prediction = new String[]{majorCards[randomise], firstAnswers[randomise], secondAnswers[randomise]};
        this.randomise = randomise;
    }

    // Геттер для prediction
    public String[] getPrediction() {
        return prediction;
    }

    public int getRandomise(){
        return randomise;
    }
}