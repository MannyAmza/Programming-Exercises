/*
 (Convert meters into feet) Write a program that reads a number in meters, converts
it to feet, and displays the result. One meter is 3.2786 feet
 */

import java.util.Scanner;

public class Ex2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a value for meter: ");
        double meter = input.nextDouble();

        double feet = meter * 3.2786;

        System.out.print("\n" + meter + " meters is " + feet + " feet");

        input.close();
    }
}
