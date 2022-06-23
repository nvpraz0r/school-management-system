package school.management.system.View;

import school.management.system.Model.GenerateData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // generate the data to be interacted with
        GenerateData generate = new GenerateData();
        generate.generateData();

        String userInput = "";

        do {
            displayMenu();
            userInput = sc.next();
            sc.nextLine();

            switch (userInput.toLowerCase()){
                case "s":
                    studentSubMenu();
                case "t":
                    teacherSubMenu();
                default:
                    System.out.println("Unknown command. Please try again.");
            }


        } while (!userInput.toLowerCase().equals("e"));
    }

    public static void displayMenu(){
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("School Management System");
        System.out.println("Main Menu");
        System.out.println("S. - Find Student");
        System.out.println("T. - Find Teacher");
        System.out.println("E. - Exit");
        System.out.println("===============");
        System.out.print("Command: ");
    }

    public static void studentSubMenu(){
        System.out.println("Student Sub Menu");
    }

    public static void teacherSubMenu(){
        System.out.println("Teacher Sub Menu");
    }
}
