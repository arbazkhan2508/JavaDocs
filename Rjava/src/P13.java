import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value!");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print asterisk
            System.out.print("*");

            // Print spaces between asterisks
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            // Print the second asterisk
            if (i != n) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }

    }
}
