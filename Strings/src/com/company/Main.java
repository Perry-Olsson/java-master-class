package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString += " \u00A9 2021";
        System.out.println("myString is equal to: " + myString);
        String lastString = "10";
        int myInt = 10;
        System.out.println(lastString + 10);
    }
}
