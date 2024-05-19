import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the temperature in Celsius (or -1 to exit):");
            double celsius = scanner.nextDouble();
            if (celsius == -1) {
                break;
            }
            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;
            System.out.printf("Celsius: %.2f, Fahrenheit: %.2f, Kelvin: %.2f%n", celsius, fahrenheit, kelvin);
        }
        scanner.close();
    }
}
