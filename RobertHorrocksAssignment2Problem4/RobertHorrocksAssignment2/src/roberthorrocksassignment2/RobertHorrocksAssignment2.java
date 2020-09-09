
package roberthorrocksassignment2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * IT2650 Assignment2 
 * @author Robert Horrocks
 */
public class RobertHorrocksAssignment2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of miles you commute as a "
                + "whole number integer:");
        int numberOfMiles = keyboard.nextInt();
        System.out.println("Enter your car's average miles per gallon, "
                + "decimals are OK:");
        float milesPerGallon = keyboard.nextFloat();
        System.out.println("Now enter the price of gas at your favorite"
                + " gas station in dollars and cents:");
        double pricePerGallon = keyboard.nextDouble();
        
        double costOfCommute = (numberOfMiles / milesPerGallon)*(pricePerGallon);
        NumberFormat costOfCommuteInDollars = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Since you drive "+ numberOfMiles + " miles with an average"
                + " miles per gallon of " + milesPerGallon + ", and the cost of gas"
                        + " is $%.2f: %n", pricePerGallon);
        System.out.println("Your cost of commute is: " + 
                costOfCommuteInDollars.format(costOfCommute));
        
        
    }
    
}
