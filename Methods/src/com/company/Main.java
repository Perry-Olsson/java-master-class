package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    boolean gameOver = true;
    int score = 5000;
    int levelCompleted = 5;
    int bonus = 100;

    System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    System.out.println(calculateScore(gameOver, score, levelCompleted, bonus));

    displayHighScorePosition("perry", calculateHighScorePosition(1001));

    printConversion(1.5);
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      return finalScore;
    }
    return -1;
  }

  public static void displayHighScorePosition(String playerName, int position) {
    System.out.println(playerName + " is in position " + position + " on the high score table");
  }

  public static int calculateHighScorePosition(int score) {
    if (score > 1000)
      return 1;
    if (score > 500)
      return 2;
    if (score > 100)
      return 3;
    return 4;
  }

  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0)
      return -1;
    double kiloToMile = 0.62137119d;
    return Math.round(kilometersPerHour * kiloToMile);
  }

  public static void printConversion(double kilometersPerHour) {
    if (kilometersPerHour < 0)
      System.out.println("Invalid Value");
    else
      System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
  }
}