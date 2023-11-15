import java.util.Scanner;

public class P26 {

    // Helper method to calculate the factorial of a number
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Boolean function to check if the number is a Strong number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sumOfFactorials = 0;

        while (num != 0) {
            int digit = num % 10;
            sumOfFactorials += factorial(digit);
            num /= 10;
        }

        return sumOfFactorials == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt(); // Replace this with the number you want to check

        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong number.");
        } else {
            System.out.println(number + " is not a Strong number.");
        }
    }
}
