package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char myChar = 'D';
        char myUnicode = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicode);
        System.out.println(myCopyrightChar);

       boolean myTrueBooleanValue = true;
       boolean myFalseBooleanValue = false;

       boolean isCustomerOverTwentyOne;

       int age = (int) (Math.random() * 100);
       if (age >= 21) {
           isCustomerOverTwentyOne = true;
       } else {
           isCustomerOverTwentyOne = false;
       }

        System.out.println(age);
        System.out.println(isCustomerOverTwentyOne);
    }
}
