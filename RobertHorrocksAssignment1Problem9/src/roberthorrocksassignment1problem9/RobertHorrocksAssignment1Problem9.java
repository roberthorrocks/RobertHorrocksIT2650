package roberthorrocksassignment1problem9;
import java.util.Scanner;
/*
 * @author Robert Horrocks
 */
public class RobertHorrocksAssignment1Problem9 {

    public static int minimumIdealWeight = 110;
    public static int heightInFeet = 5;
    public static int poundsPerAdditionalInch = 5;

     public static void main(String []args){
        Scanner keyboard = new Scanner(System.in);
          
        System.out.println("Enter how many feet tall you are in whole numbers: ");
		int numberOfFeet = keyboard.nextInt();
		System.out.println("You entered " + numberOfFeet + ".");
        System.out.println("Enter how many additional remaining inches tall you are in whole numbers: ");
		int numberOfInches = keyboard.nextInt();
		System.out.println("You entered " + numberOfInches + ".");
        int idealWeight = minimumIdealWeight + ((numberOfFeet - heightInFeet)*5*12)
                + ((numberOfInches)*5);
        System.out.println("Your ideal weight is: " + idealWeight );
     }
}