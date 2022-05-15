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
            else if (offense.equals("-b")) System.out.println("Bastard");
            else if (offense.equals("-m")) System.out.println("Motherfucker");
            else if (offense.equals("-i")) System.out.println("Idiot");
            else if (offense.equals("-s")) System.out.println("Suck my dick!!");
        }
    }
    
}
