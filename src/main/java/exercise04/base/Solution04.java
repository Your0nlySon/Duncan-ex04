package exercise04.base;

/*
     UCF COP3330 Fall 2021 Assignment 1 Solution
     Copyright 2021 first_name last_name
 */


import java.util.Scanner;

public class Solution04 {

    /*
    print: Enter a noun
    'noun': read the string from the user
    print: Enter a verb
    'verb': read the string from the user
    print: Enter an adjective
    'adjective': read the string from the user
    print: Enter an adverb
    'adverb': read the string from the user
    print: Do your 'verb' your 'adjective' 'noun' 'adverb'? That is what I call a Madlib
     */
    public static void main(String[] args) {

        System.out.printf("Enter a noun: ");
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();

        System.out.printf("Enter a verb: ");
        Scanner input2 = new Scanner(System.in);
        String verb = input2.nextLine();

        System.out.printf("Enter a adjective: ");
        Scanner input3 = new Scanner(System.in);
        String adjective = input3.nextLine();

        System.out.printf("Enter a adverb: ");
        Scanner input4 = new Scanner(System.in);
        String adverb = input4.nextLine();

        System.out.printf("Do your " + verb + " your " + adjective + " " + noun + " " + adverb + "? That is what I call a Mad lib.");
    }
}
