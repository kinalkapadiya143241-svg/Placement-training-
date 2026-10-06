import java.util.Scanner;

public class JavaScanner_Que_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers (enter any non-integer to stop):");

        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        }

        String invalidInput = sc.next();
        System.out.println("Non-integer detected ('" + invalidInput + "'). Program terminated.");
        sc.close();
    }
}
