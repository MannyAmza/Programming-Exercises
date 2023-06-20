/*
 (Average speed in miles) 
 Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds.
 Write a program that displays the average speed in miles per hour.
(Note that 1 mile is 1.6 kilometers.)
 */

public class Ex1_10 {
    public static void main(String[] args) {
        double kilometers = 15.0;
        double minutes = 50.5;
        //double seconds = 30.0;
        double miles = km_m(kilometers);
        double hour = min_sec_to_hr(minutes);

        System.out.println("The average speed in mph is " + miles/hour);
    }
    public static double km_m(double km) {
        double miles = km/1.6;
        return miles;
    }
    public static double min_sec_to_hr(double min /*double sec*/) {
        //double minutes = sec/60.0;
        double hr = min/60;
        return hr;
    }
}
