package exercises;
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        Double recLength = input.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        Double recWidth = input.nextDouble();
        Double area = recWidth*recLength;
        System.out.println("The area of your rectangle is: " + area);
    }
}
