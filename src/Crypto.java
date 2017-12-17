/*
Microsoft: DEV276x
Learn to Program in Java
Module 3 Project - Crypto.
*/

import java.util.Scanner;

public class Crypto {

    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.next();
        System.out.println("Welcome! Please, enter the text you want to encrypt: ");


    }

    public static String normalizeText(String text) {

        String result = "";

        for (int position = 0; position <= (text.length() - 1); ++position) {

            String character = text.substring(position, position + 1);

            if (alphabet.indexOf(character.toUpperCase()) != -1) {

                result += text.substring(position, position + 1).toUpperCase();

            }
        }

        return result;

    }

    public static String cesarify(String text, int shiftkey) {

        String newAlphabet = shiftAlphabet(shiftkey);
        String result = "";

        for (int position = 0; position <= (text.length() - 1); ++position) {

            int i = alphabet.indexOf(text.charAt(position));

            result += newAlphabet.charAt(i);

        }

        return result;

    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for (; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if (result.length() < 26) {
            for (currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;


    }

    public static String groupify(String t, int groupLength) {

        String x = "";
        String result = "";
        String total = "";

        if ((t.length() % groupLength) == 0) {

            result = t;

        } else {

            for (int i = t.length(); i < ((t.length() / groupLength + 1) * groupLength); ++i) {

                x += "x";

            }

            result = t + x;
        }

        for (int j = 0; j < result.length(); ++j) {

            if (((j + 1) % groupLength) == 0) {

                total = total + result.substring(j, j + 1) + " ";

            } else {

                total = total + result.substring(j, j + 1);
            }

        }

        return total;

    }


}
