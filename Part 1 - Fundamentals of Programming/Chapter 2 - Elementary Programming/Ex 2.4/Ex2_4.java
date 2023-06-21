/*
 (Convert square meter into ping) Write a program that converts square meter into ping.
The program prompts the user to enter a number in square meter, converts it to ping,
and displays the result. One square meter is 0.3025 ping.
 */
import java.util.*;
public class Ex2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a number in square meters: ");
        double sqrMeter = input.nextDouble();

        double ping = sqrMeter * 0.3025;

        System.out.print("\n" + sqrMeter + " square meters is " + ping + " pings");

        input.close();
    }
}
