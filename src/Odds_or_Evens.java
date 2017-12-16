/*
Microsoft: DEV276x
Learn to Program in Java
Module 2 Project - Odds or Evens
*/

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Odds_or_Evens {

    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        out.println("Let’s play a game called “Odds and Evens!");
        out.println("What is your name? ");
        String name = input.nextLine();
        out.println("Nice to meet you, " + name + "!");
        String choice = "";
        // while loop to get valid input from the user
//        while ((choice.toLowerCase().equals("q") || choice.toLowerCase().equals("o") || choice.toLowerCase().equals("e")) != true) {
        while (!(choice.toLowerCase().equals("o") || choice.toLowerCase().equals("e"))) {
//            out.print("Which do you choose? (O,o)dds or (E,e)vens? (Q,q) for quit: ");
            out.println("Which do you choose? (O,o)dds or (E,e)vens? ");
            choice = input.nextLine();
            if (choice.toLowerCase().equals("o")) {
                out.println(name + " has picked odd. The computer will be evens.");
            } else if (choice.toLowerCase().equals("e")) {
                out.println(name + " has picked even. The computer will be odds.");
//            } else if (choice.toLowerCase().equals("q")) {
//                out.println(name + " has chosen quit. Bye, " + name + ", see you later.");
//                break;
            } else {
                out.println("Incorrect input, try again.");
            }
        }
        out.println("----------------");
        out.println("");
        //play game
        int playerFingers = -1;
        while (!((playerFingers >= 0) && (playerFingers < 11))) {

            out.println("How many \"fingers\" do you put out? ");
            playerFingers = input.nextInt();
            if ((playerFingers >= 0) && (playerFingers < 11)) {

                out.println("Correct, " + name + " you choice is " + playerFingers + ". Lets wait for computer choice.");


            } else {

                out.println("Hey, you have to input number in range 0 - 10, try again.");

            }
        }
        Random rand = new Random();
        int computer = rand.nextInt(10);
        int sum = playerFingers + computer;
        boolean oddOrEven = sum % 2 == 0;
        out.println("----------------");
        out.println("");
        out.println(playerFingers + " + " + computer + " = " + sum);
        if (oddOrEven) {
            out.println(sum + " is ...even!");
            if (choice.toLowerCase().equals("e")) {
                out.println("That means " + name + " wins! :)");
            } else {
                out.println("That means computer wins! :(");
            }
        } else {
            out.println(sum + " is ...odd!");
            if (choice.toLowerCase().equals("o")) {
                out.println("That means " + name + " wins! :)");
            } else {
                out.println("That means computer wins! :(");
            }
        }
        out.println("----------------");

    }
}
