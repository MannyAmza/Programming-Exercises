/*
 (Area and perimeter of a rectangle) 
 Write a program that displays the area and perimeter of a rectangle 
 with a width of 5.3 and height of 8.6 using the following formula:
 area = width * height
 perimeter = 2 * (width + height)
 */

public class Ex1_9 {
    public static void main(String[] args) {
        double width=5.3, height=8.6;
        double area=width*height;
        double perimeter = 2*(width+height);

        System.out.println(area);
        System.out.println(perimeter);
        
    }
}
