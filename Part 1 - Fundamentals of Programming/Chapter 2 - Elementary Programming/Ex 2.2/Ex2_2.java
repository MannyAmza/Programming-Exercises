/*
 (Compute the volume of a triangle) Write a program that reads in the length of
sides of an equilateral triangle and computes the area and volume using the following formulas:
 area = sqrt(3)/4 (length of sides)^2
 volume = area * length
 */
import java.util.*;
public class Ex2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter length of the sides and height of the Equilateral triangle: ");
        double sideLength = input.nextDouble();

        double area = ((Math.sqrt(3))/4)*(Math.pow(sideLength, 2));
        double volume = area * sideLength;

        System.out.print("\nThe area is " + area);
        System.out.print("\nThe volume of the Triangular prism is " + volume);

        input.close();
    }
}
