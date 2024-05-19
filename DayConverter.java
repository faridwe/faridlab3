import java.util.Scanner;

public class DayConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number of days (or a non-positive value to exit):");
            int days = scanner.nextInt();
            if (days <= 0) {
                break;
            }
            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");
        }
        scanner.close();
    }
}
