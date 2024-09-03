import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit = ");
        double fahrenheit = scanner.nextDouble();
        double celsius = TempConvert.fToC(fahrenheit);
        System.out.printf("Temperature in Celsius = %.2f°C%n", celsius);

        System.out.print("Enter the length in Centimeter = ");
        double centimeter = scanner.nextDouble();
        double kilometer = MeterConvert.cmToKm(centimeter);
        System.out.printf("The length in Kilometer = %.2f km%n", kilometer);

        System.out.print("Enter a number = ");
        int number = scanner.nextInt();
        String formattedNumber = OddEven.formatIDR(number);
        if (OddEven.isOdd(number)) {
            System.out.println(formattedNumber + " is odd.");
        }
        else {
            System.out.println(formattedNumber + " is even.");
        }

        System.out.print("Enter the main string = ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the search string = ");
        String searchString = scanner.nextLine();

        String result = ChangeString.removeFirstOccurrence(mainString, searchString);

        System.out.println("Main String = " + mainString);
        System.out.println("Search String = " + searchString);
        System.out.println("Result String = " + result);
    }
}