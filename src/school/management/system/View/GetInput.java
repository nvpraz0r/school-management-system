package school.management.system.View;
import java.util.Scanner;

/**
 *
 */
public class GetInput {
    private static Scanner sc = new Scanner(System.in);

    /**
     * This function prompts user input and returns the result in lower case
     * @return string s - user input
     */
    public static String getString(){
        String s = "";
        System.out.print("Enter a command: ");
        s = sc.next();
        sc.nextLine();
        return s.toLowerCase();
    }
}
