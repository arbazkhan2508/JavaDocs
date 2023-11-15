public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29; // Change this number to check for different numbers

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for factors up to the square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If a factor is found, the number is not prime
            }
        }

        return true; // If no factors are found, the number is prime
    }
}
