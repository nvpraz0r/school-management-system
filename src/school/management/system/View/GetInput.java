package school.management.system.View;

import java.util.Scanner;

public class GetInput {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(){
        String s = "";
        System.out.print("Enter a command: ");
        s = sc.next();
        sc.nextLine();
        return s.toLowerCase();
    }
}
