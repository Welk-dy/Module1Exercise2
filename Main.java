import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to input the token

        int choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Fahrenheit to Celcius converter");
            System.out.println("2. Centimeter to Kilometer converter");
            System.out.println("3. Odd or even checker");
            System.out.println("4. Remove search string from main string ");
            System.out.println("5. Palindrome Checker");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6) = ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Task 1 Fahrenheit to Celcius
                    System.out.print("Enter temperature in Fahrenheit = "); // Print just for display
                    double fahrenheit = scanner.nextDouble(); // Scanner to input the token
                    double celsius = tempConvert.fToC(fahrenheit); // Declare conversion function from TempConvert (class) with fToC
                    System.out.printf("Temperature in Celsius = %.2f°C%n", celsius); // To print out the result of conversion in Celcius, %.2f is for the the decimals, °C is typed on display, %n for spacing on display)
                    break;

                case 2:
                    // Task 2 Cm to Km
                    System.out.print("Enter the length in Centimeter = "); // Print just for display
                    double centimeter = scanner.nextDouble(); // Scanner to input the token
                    double kilometer = meterConvert.cmToKm(centimeter); // Declare conversion function from MeterConvert (class) with cmToKm
                    System.out.printf("The length in Kilometer = %.2f km%n", kilometer); // To print out the result of conversion in Celcius
                    break;

                case 3:
                    // Task 3 Odd or Even Checker with formatted number on IDR
                    System.out.print("Enter a number = "); // Print just for display
                    int number = scanner.nextInt(); // Scanner to input the token
                    String formattedNumber = oddEven.formatIDR(number); // Declare a new one in String, and format the token number to IDR from oddEven class
                    if (oddEven.isOdd(number)) { // If function odd or even from oddEven class to the number
                        System.out.println(formattedNumber + " is odd."); // Print out the formatted number on IDR if n % 2 != 0 (this mean there's no remainder and that's mean even)
                    } else {
                        System.out.println(formattedNumber + " is even.");
                    }
                    break;

                case 4:
                    // Task 4 Remove search string from main string
                    System.out.print("Enter the main string = ");
                    String mainString = scanner.nextLine();
                    System.out.print("Enter the search string = ");
                    String searchString = scanner.nextLine();

                    String result = changeString.removeString(mainString, searchString);

                    System.out.println("Result String = " + result);
                    break;

                case 5:
                    // Task 5 Palindrome Checker
                    System.out.print("Input the word for palindrome checker: ");
                    String inputString = scanner.nextLine();

                    // Remove non-alphanumeric characters and convert to lowercase (QA system)
                    String cleanedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                    // Check if the cleaned string is a palindrome
                    if (palindromeChecker.isPalindrome(cleanedString)) {
                        System.out.println("\"" + inputString + "\" is a palindrome.");
                    } else {
                        System.out.println("\"" + inputString + "\" is not a palindrome.");
                    }
                    break;

                case 6:
                    // Exit System
                    System.out.println("Exiting...");
                    break;

                default:
                    // Prevent invalid choice and back to the loop
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
                    break;
            }
        }
        while (choice != 6);
        // Close the scanner
        scanner.close();
    }
}