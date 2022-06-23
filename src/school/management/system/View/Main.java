package school.management.system.View;

import school.management.system.Model.GenerateData;

import java.util.Scanner;

public class Main {

    private static String userInput = "";

    public static void main(String[] args) {

        // generate the data to be interacted with
        GenerateData generate = new GenerateData();
        generate.generateData();


        displayMenu();

        do {
            userInput = GetInput.getString();
            switch (userInput){
                case "s" -> studentSubMenu();
                case "t" -> teacherSubMenu();
                case "e" -> System.out.println("Exiting");
                default -> System.out.println("Unknown command. Please try again.");
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
    }

    public static void displayStudentMenu(){
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("School Management System");
        System.out.println("Student Menu");
        System.out.println("P. - Pay Tuition");
        System.out.println("E. - Exit");
        System.out.println("===============");
    }

    public static void studentSubMenu(){
        displayStudentMenu();
        do{
            userInput = GetInput.getString();
            switch (userInput){
                case "p" -> System.out.println("Tuition Paid");
                case "e" -> System.out.println("Exiting Student Sub Menu");
                default -> System.out.println("Unknown command. Please Try again");
            }
        } while(!userInput.equals("e"));
    }

    public static void teacherSubMenu(){
        System.out.println("Teacher Sub Menu");
    }
}
