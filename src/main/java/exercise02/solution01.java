/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Duane_Ortiz
 */
package exercise02;
import java.util.Scanner;
public class solution01 {
    /*
     Prompt user to input string
     read string and display
     include number of characters in string
     */
    public static void main(String[] args){
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = str.length();
        System.out.println(str + " has "+ str.length() + " characters.");
    }
}

