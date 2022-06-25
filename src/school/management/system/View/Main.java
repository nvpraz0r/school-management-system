package school.management.system.View;
import school.management.system.Model.GenerateData;

public class Main {
    public static void main(String[] args) {

        // generate the data to be interacted with
        GenerateData.generateData();

        String userInput = "";

        displayMenu();

        do {
            userInput = GetInput.getString();
            switch (userInput){
                case "p" -> ModifyData.payTuition();
                case "t" -> ModifyData.salaryRaise();
                case "q" -> System.out.println("Quitting");
                default -> System.out.println("Unknown command. Please try again.");
            }
        } while (!userInput.toLowerCase().equals("q"));
    }

    /**
     *
     */
    public static void displayMenu(){
        System.out.println("\n");
        System.out.println("===============");
        System.out.println("School Management System");
        System.out.println("Main Menu");
        System.out.println("P. - Pay Tuition");
        System.out.println("T. - ");
        System.out.println("Q. - Quit");
        System.out.println("===============");
    }
}
