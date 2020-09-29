/*
 */
package roberthorrocksassignment3problem4;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Robert Horrocks- IT2650, September 28, 2020
 */
public class RobertHorrocksAssignment3Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        BlogEntry DisplayEntry = new BlogEntry("myUserName", "myBlogPost", "myDate");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your User Name:");
        String userName = keyboard.nextLine( );
        System.out.println("Please enter the blog post:");
        String userPost = keyboard.nextLine( );
        
        String delimiters = " ";
        StringTokenizer firstTenWords =
                new StringTokenizer(userPost, delimiters);
        String firstWord = firstTenWords.nextToken();
        String secondWord = firstTenWords.nextToken();
        String thirdWord = firstTenWords.nextToken();
        String fourthWord = firstTenWords.nextToken();
        String fifthWord = firstTenWords.nextToken();
        String sixthWord = firstTenWords.nextToken();
        String seventhWord = firstTenWords.nextToken();
        String eighthWord = firstTenWords.nextToken();
        String ninthWord = firstTenWords.nextToken();
        String tenthWord = firstTenWords.nextToken();
        
        
        System.out.println("Please enter the date:");
        String postDate = keyboard.nextLine( );
        DisplayEntry.set(userName, userPost, postDate);
        System.out.println("Here is your post");
        System.out.println(DisplayEntry);
        
        System.out.println("The first 10 words summary from your post is ");
        
        System.out.println("The first 10 words of your post are: ");
        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);
        System.out.println(fifthWord);
        System.out.println(sixthWord);
        System.out.println(seventhWord);
        System.out.println(eighthWord);
        System.out.println(ninthWord);
        System.out.println(tenthWord);
        
    }


    
}
