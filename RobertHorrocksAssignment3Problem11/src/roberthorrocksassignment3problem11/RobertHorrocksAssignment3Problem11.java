
package roberthorrocksassignment3problem11;
import java.util.Random;

/**
 * IT2650 Assignment 3 Number 11- Random Winners
 * @author Robert Horrocks
 */
public class RobertHorrocksAssignment3Problem11 {

    /**
     */
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int counter = 1;
        
        while (counter <=1)
        {
            int winner1 = 1 + randomGenerator.nextInt(29);
                System.out.println("Winner number 1: " + winner1);
            
            int winner2 = 1 + randomGenerator.nextInt(29);
                if (winner2 != winner1)
                    {System.out.println("Winner number 2: " + winner2);}
                else
                    {winner2 = 1 + randomGenerator.nextInt(29);
                    System.out.println("Winner number 2: " + winner2);}
                
            int winner3 = 1 + randomGenerator.nextInt(29);
                if (winner3 != winner1 && winner3 != winner2)
                    {System.out.println("Winner number 3: " + winner3);}
                else
                    {winner3 = 1 + randomGenerator.nextInt(29);
                    System.out.println("Winner number 3: " + winner3);}
                
            counter++;
            
            
        }
    }
    
}
