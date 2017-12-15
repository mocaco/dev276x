/*
Microsoft: DEV276x
Learn to Program in Java
Module 1 Project - Trip Planner
*/
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import java.lang.Math.*;

public class Trip_Planner {
    public static void main(String[] args) {

        Greeting();
        TravelTimeAndBudget();
        TimeDifference();
        CountryArea();
        HowFar();
    }

    public static void Greeting() {
        Scanner input = new Scanner(in);
        out.println("Welcome to Trip Planner!");
        out.print("What is your name? ");
        String name = input.nextLine();
        out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String city = input.nextLine();
        out.println("Great! " + city + " sounds like a great trip.");
        out.println("----------------");
    }

    public static void TravelTimeAndBudget() {
        Scanner input = new Scanner(in);
        out.print("How many days are you going to spend travelling? ");
        Double daysOfTrip = input.nextDouble();
        out.print("How much money, in BTC, are you planning to spend on your trip? ");
        Double moneyTotal = input.nextDouble();
        out.print("What is the three letter currency symbol for your travel destination? ");
        String currencyCode = input.next();
        out.print("How many " + currencyCode + " are there in 1 BTC? ");
        Double exchangeRate = input.nextDouble();
        int hoursOfTrip = (int) (60 * daysOfTrip);
        int minutesOfTrip = 60 * hoursOfTrip;
        out.println("");
        out.println("If you are travelling for " + daysOfTrip + " days that is the same as " + hoursOfTrip + " hours or " + minutesOfTrip + " minutes.");
        double moneyPerDay = moneyTotal / (double) daysOfTrip;
        out.println("If you are going to spend " + moneyTotal + " BTC that means per day you can spend up to " + round(moneyPerDay) + " BTC.");
        double moneyLocal = exchangeRate * moneyTotal;
        double moneyLocalPerDay = moneyTotal * exchangeRate / daysOfTrip;
        out.println("Your total budget in " + currencyCode + " is " + round(moneyLocal) + " " + currencyCode + ", which per day is " + round(moneyLocalPerDay) + " " + currencyCode + ".");
        out.println("----------------");
    }

    public static double round(double d) {
        double castToDouble = (int) (d / 1) + ((double) (((int) (d * 100)) % 100)) / 100;
        return castToDouble;
    }

    public static void TimeDifference() {

        Scanner input = new Scanner(in);
        out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDifference = input.nextInt();
        timeDifference = timeDifference % 24;
        int destinationTimeHomeMidnight = ( 24 + timeDifference) % 24;
        int destinationTimeHomeNoon = ( 12 + destinationTimeHomeMidnight ) % 24;
        out.print("That means that when it is midnight at home it will be " + destinationTimeHomeMidnight + ":00 in your travel destination. ");
        out.println("and when it is noon at home it will be " + destinationTimeHomeNoon + ":00.");
        out.println("----------------");

    }

    public static void CountryArea() {

        Scanner input = new Scanner(in);
        out.print("What is the square area of your destination country in km2? ");
        Double areaKm2 = input.nextDouble();
        Double areaMi2 = round(areaKm2 * 0.386102);
        out.println("In miles2 that is " + areaMi2);
        out.println("----------------");

    }

    public static void HowFar() {

        Scanner input = new Scanner(in);
        out.print("What is the home longitide? ");
        Double homeLongitude = input.nextDouble();
        out.print("What is the home lattitude? ");
        Double homeLattitude = input.nextDouble();
        out.print("What is the destination longitide? ");
        Double destinationLongitude = input.nextDouble();
        out.print("What is the destination lattitude? ");
        Double destinationLattitude = input.nextDouble();
        Double distance = calculateDistance(homeLongitude, homeLattitude, destinationLongitude, destinationLattitude);
        distance = round(distance);
        out.println("That means that the distance between home and distination is about " + distance + " kms.");
        out.println("----------------");
    }

    public static double calculateDistance (Double homeLongitude, Double homeLattitude, Double destinationLongitude, Double destinationLattitude ) {

        homeLongitude = homeLongitude * Math.PI / 180;
        homeLattitude = homeLattitude * Math.PI / 180;
        destinationLongitude = destinationLongitude * Math.PI / 180;
        destinationLattitude = destinationLattitude * Math.PI / 180;
        Double midLongitude = (destinationLongitude - homeLongitude) / 2;
        Double midLattitude = (destinationLattitude - homeLattitude) / 2;
        Double distance = 2 * 6371 * Math.asin(Math.sqrt(Math.sin(midLattitude) * Math.sin(midLattitude) + Math.cos(destinationLattitude) * Math.cos(homeLattitude) * Math.sin(midLongitude) * Math.sin(midLongitude)));
        return distance;
    }
}
