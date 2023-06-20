/*
 (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
■■ One birth every 7 seconds
■■ One death every 13 seconds
■■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume that
the current population is 312,032,486, and one year has 365 days. Hint: In Java, if
two integers perform division, the result is an integer. The fractional part is truncated.
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result
with the fractional part, one of the values involved in the division must be a number
with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
*/
public class Ex1_11 {
    public static void main(String[] args) {
        int curr_pop = 312032486;

        //Rate are in seconds
        double birthRate=7.0, deathRate = 13.0, newImmRate = 45.0;

        double seconds = 60*60*24*365;

        double numBirths = seconds/birthRate;
        double numDeaths = seconds/deathRate;
        double numImms = seconds/newImmRate;

        for(int i = 1; i <= 5; i++){
            curr_pop += numBirths + numImms - numDeaths;
            System.out.println("Year " + i + ": " + curr_pop);
        }

    }
        
}
