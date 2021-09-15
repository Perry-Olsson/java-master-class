package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println(" previous result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3;
        System.out.println("Remainder of result / 3 = " + result);

        //  Abbreviating operators
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);


        // if-then
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm scared of aliens");
        }

        // Logical AND Operator
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical OR operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // Assignment Operator VS Equals to Operator
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("is car is false");
        }

        // ternary operator

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("isCar was a car");
        }

        //challenge

        double myDouble = 20.00d;
        double mySecondDouble = 80.00d;
        boolean isZero = ((myDouble + mySecondDouble) * 100d) % 40 == 0 ? true : false;
        System.out.println("isZero = " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
