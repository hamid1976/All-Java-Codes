import java.util.Scanner;

public class EnumScanner {
    // Enum definition
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Display menu options
        System.out.println("Select a day of the week:");
        for (Day day : Day.values()) {
            System.out.println((day.ordinal() + 1) + ". " + day);
        }

        // Prompt user for input
        System.out.print("Enter the number corresponding to your choice: ");

        // Read user input
        int choice = scanner.nextInt();

        // Validate user input
        if (choice >= 1 && choice <= Day.values().length) {
            // Get the selected day based on user input
            Day selectedDay = Day.values()[choice - 1];

            // Display the selected day
            System.out.println("You selected: " + selectedDay);
        } else {
            System.out.println("Invalid choice. Please enter a valid number.");
        }

        // Close the scanner
        scanner.close();
    }
}
