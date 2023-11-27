import java.util.Scanner;

public class metricconveter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the unit to convert from
        System.out.print("Enter the unit you want to convert from\n 1. Feet to Meters\n 2. Pounds to KGs\n 3. Fahrenheit to Celsius\n Option: ");
        String fromUnit = scanner.nextLine();

        // Prompt the user to enter the unit to convert to
        System.out.print("Enter the unit you want to convert to: ");
        String toUnit = scanner.nextLine();

        // Prompt the user to enter the quantity to be converted
        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        // Perform the conversion based on the units
        double result = convert(fromUnit, toUnit, quantity);

        // Display the result
        System.out.println(quantity + " " + fromUnit + " is equal to " + result + " " + toUnit);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }

    // Method to perform unit conversion
    private static double convert(String fromUnit, String toUnit, double quantity) {
        // Add your conversion logic here based on the units
        // For example, you can have a series of if-else statements or a switch statement

        // Placeholder conversion logic (replace with your own)
        if ("feet".equalsIgnoreCase(fromUnit) && "meters".equalsIgnoreCase(toUnit)) {
            // Conversion from feet to meters (1 foot = 0.3048 meters)
            return quantity * 0.3048;
        } else if ("pounds".equalsIgnoreCase(fromUnit) && "kilograms".equalsIgnoreCase(toUnit)) {
            // Conversion from pounds to kilograms (1 pound = 0.453592 kilograms)
            return quantity * 0.453592;
        }else if ("Fahrenheit".equalsIgnoreCase(fromUnit) && "Celsius".equalsIgnoreCase(toUnit)){
            // Conversion from Fahrenheit to Celsius (1 Fahrenheit =-17.22 Celsius)
            return quantity * (-17.22);
        }else {
            // Handle other unit conversions
            System.out.println("Unsupported unit conversion.");
            System.exit(1); // Exit the program if the conversion is not supported
            return 0; // This return statement will not be reached, but added to satisfy the compiler
        }
    }
}
