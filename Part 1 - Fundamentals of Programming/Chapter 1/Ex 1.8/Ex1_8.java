/*
(Area and perimeter of a circle) 
Write a program that displays the area and perimeter of a circle 
that has a radius of 6.5 using the following formula:
pi = 3.14159
perimeter = 2 * radius * pi
area = radius * radius * pi
*/ 

public class Ex1_8 {
    public static void main(String[] args) {
        double pi = 3.14159;
        double radius = 6.5;
        double perimeter = 2*radius*pi;
        double area = radius*radius*pi;

        System.out.println(perimeter);
        System.out.println(area);
    }
}
