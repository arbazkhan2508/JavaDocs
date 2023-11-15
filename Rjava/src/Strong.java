public class Strong {
        public static void main(String[] args) {
            int number = 145;
            if (isStrongNumber(number)) {
                System.out.println(number + " is a strong number.");
            } else {
                System.out.println(number + " is not a strong number.");
            }
        }

        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }

        public static boolean isStrongNumber(int num) {
            int originalNum = num;
            int sumOfFactorial = 0;

            while (num > 0) {
                int digit = num % 10;
                sumOfFactorial += factorial(digit);
                num /= 10;
            }

            return sumOfFactorial == originalNum;
        }
}
