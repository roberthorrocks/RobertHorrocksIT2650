/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roberthorrocksassignment3problem4;


/**
 *
 * @author tipph
 */
public class BlogEntry {
    
            
    private String userName;
    private String userPost;
    private String postDate;

    public String toString( )
    {
        return ("User Name: " + userName + "\nBlog Entry: " + userPost 
                    + "\nDate: " + postDate);
    }

    public BlogEntry(String initialUserName, String initialUserPost, String initialPostDate)
    {
        userName = initialUserName;
        userPost = initialUserPost;
        postDate = initialPostDate;
        
    }

    public void set(String newUserName, String newUserPost, String newPostDate)
    {
        userName = newUserName;
        userPost = newUserPost;
        postDate = newPostDate;    
    }
    
}
    

