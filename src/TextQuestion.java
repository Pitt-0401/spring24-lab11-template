/*
 * Created on 2024-03-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

public class TextQuestion implements Question {
    private String question;
    private String[] options;
    private char correctAnswer;

    // Constructor & getters
    public TextQuestion(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    // Implement the interface methods
    @Override
    public int score(String answer) {
        // TODO: implement the score method
        // Should return 1 if the answer is correct, otherwise return0
        return 0;
    }

    @Override
    public void display(TriviaView view) {
        // TODO: Add questions and answer options to the view
    }

    @Override
    public void showResult(String answer, TriviaView view) {
        // TODO: Add an appropriate output for the result
        String resultText = "";
        view.showResultResult(resultText);
    }

    @Override
    public void clearResultText(TriviaView view) {
        view.clearResultText();
    }
}
