import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        double randomValue = Math.random();

        int min = 1;
        int max = 100;
        int randomNumber = (int) (min + (max - min + 1) * randomValue);
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number!");
        System.out.println(randomNumber);
        int n = sc.nextInt();
        do {
            if (n>randomNumber){
                System.out.println("Value is too high!");
            } else if (n<randomNumber) {
                System.out.println("Value is to  low try again");
            }
            n= sc.nextInt();
        }while (n!=randomNumber);

        System.out.println("Random Number: " + randomNumber);

    }
}
