import java.util.Scanner;

/**
 * 
 *
 * @author Kristian J. Payne
 * @version 1.2
 */
public class Main
{

    public static void Main(String args[])
    {
        System.out.println("Please copy and paste your profile source code below: ");
        Scanner scn = new Scanner(System.in);
        String source = scn.next();
        if(source != null){
            Parser parser = new Parser(source);
        }else{
            System.out.println("You inputted nothing ya goon");
        }
    }

}
