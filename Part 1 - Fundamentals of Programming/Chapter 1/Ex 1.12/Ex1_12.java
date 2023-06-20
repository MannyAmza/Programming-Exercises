/*
 (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
minutes, and 35 seconds. Write a program that displays the average speed in
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */

public class Ex1_12 {

    public static void main(String[] args) {
        int miles = 24;
        double hr = 1.0, min = 40.0, sec = 35.0;

        min = min + sec/60;
        hr = hr + min/60;

        double km = miles * 1.6;
        double km_hr = km/hr;

        System.out.println("The average speed of the runner in kilometers per hour is " + km_hr);
    }
}
