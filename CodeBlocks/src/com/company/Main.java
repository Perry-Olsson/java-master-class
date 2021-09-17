package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    if (gameOver) {
      System.out.println(calculateScore(score, levelCompleted, bonus));
    }

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    if (gameOver) {
      System.out.println(calculateScore(score, levelCompleted, bonus));
    }
  }

  public static int calculateScore(int score, int levelCompleted, int bonus) {
    int finalScore = score + (levelCompleted * bonus);
    return finalScore;
  }
}
