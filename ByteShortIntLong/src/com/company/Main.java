package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myMinInt = Integer.MIN_VALUE;
        int myMaxInt = Integer.MAX_VALUE;
        System.out.println("Max int = " + myMaxInt);
        System.out.println("Min int = " + myMinInt);
        System.out.println("busted max val = " + (myMaxInt + 1));

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("The min byte value is: " + myMinByte);
        System.out.println("The max byte value is: " + myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("The min byte value is: " + myMinShort);
        System.out.println("The max byte value is: " + myMaxShort);
        
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("The min byte value is: " + myMinLong);
        System.out.println("The max byte value is: " + myMaxLong);

        int myTotal = myMinInt / 2;
        byte myByteTotal = (byte)(myMinByte / 2);
        short myShortTotal = (short) (myMinShort / 2);

        byte myB = 10;
        short mySh = 129;
        int myInt = 39000;
        long myL = ((myB + mySh + myInt) * 10) + 50000;
        System.out.println(myL);
    }
}
