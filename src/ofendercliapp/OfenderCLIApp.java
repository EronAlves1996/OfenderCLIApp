package ofendercliapp;

import java.util.Arrays;

/**
 *
 * @author Eron Alves
 * This class initialize the simple ofender
 */
public class OfenderCLIApp {

    /**
     * @param args Define the offenses the program will print in command line
     */
    public static void main(String[] args) {
        if (args.length == 0) System.out.println("You dont insert any offense! IDIOT!!!");
        for (String offense : args) {
            if (offense.equals("-f")) System.out.println("Fuck you");
            else if (offense.equals("-a")) System.out.println("Asshole");
        }
    }
    
}
