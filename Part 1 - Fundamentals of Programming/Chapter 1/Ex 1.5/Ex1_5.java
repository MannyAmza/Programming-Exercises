//(Compute expressions) Write a program that displays the result of
//(7.5 * 6.5 - 4.5 * 3)/47.5 - 5.5
public class Ex1_5 {
    public static void main(String[] args) {
        double x = 7.5 * 6.5;
        double y = 4.5 * 3;
        double z = 47.5 - 5.5;
        double w = x - y;
        double v = w/z;
        System.out.println(v);
    }
}
