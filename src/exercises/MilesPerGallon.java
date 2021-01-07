package exercises;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles you have driven: ");
        Double milesDriven = input.nextDouble();
        System.out.println("Please enter the amount of gas you've consumed (in gallons): ");
        Double gallonsUsed = input.nextDouble();
        Double mpg = milesDriven/gallonsUsed;
        System.out.println("Your miles per gallon is: " + mpg);
    }
}
