package com.purwadhika;

import java.util.Random;
import java.util.Scanner;

public class WorldGuessGame {

    private static final String[] WORDS = {"java", "python", "kotlin", "flutter", "golang"};
    private String randomWord;
    private String hiddenWord;
    private int attemptsLeft = 6;

    public WorldGuessGame() {
        this.randomWord = selectRandomWord();
        hideWord(this.randomWord);
    }

    public String selectRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }

    public String hideWord(String word) {
        String str = "";
        for(int i = 0; i < word.length(); i++) {
            str += "_";
        }
        return str;
    }

    public char getPlayerGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        return scanner.next().charAt(0);
    }

    public boolean isGuessCorrect(String word, char guess) {
        throw new UnsupportedOperationException("isGuessCorrect is not supported");
    }

    public String updateHiddenWord(String word, String hiddenWord, char guess) {
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                updatedHiddenWord.setCharAt(i, guess);
            }
        }
        return updatedHiddenWord.toString();
    }

    public void displayGameResult(String wordToGuess, String hiddenWordm, int attemptsLeft) {
        if (wordToGuess.equals(hiddenWord)) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Game over! The correct word was: " + wordToGuess);
        }
    }
}
