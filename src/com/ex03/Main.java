/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input_val = new Scanner(System.in);
        String quote;
        String speaker;
        System.out.print("What is the quote? ");
        quote = input_val.nextLine();
        System.out.print("Who said it? ");
        speaker = input_val.nextLine();
        System.out.println(speaker + " says, \"" + quote + "\"");
    }
}
