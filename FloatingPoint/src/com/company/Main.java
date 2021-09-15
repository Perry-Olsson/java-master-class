package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Min float is: " + myMinFloat);
        System.out.println("Max float is: " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Min double is: " + myMinDouble);
        System.out.println("Max double is: " + myMaxDouble);

        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My int value = " + myIntValue);
        System.out.println("My float value = " + myFloatValue);
        System.out.println("My double value = " + myDoubleValue);


        //@Challenge

        double pounds = 190d;
        final double kgToPounds = 0.45359237d;
        double kilograms = pounds * kgToPounds;
        System.out.println(pounds + " pounds is equal to: " + kilograms);
    }
}
