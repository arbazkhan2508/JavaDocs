import java.util.Scanner;

public class P25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number!");
        int n = sc.nextInt();

        int reverseNumber = reverseNumber(n);
        int sum = reverseNumber(n);
        System.out.println(reverseNumber);

        if (n == sum){
//            System.out.println("Its Palindrom!");
            System.out.println("Its Armstrong!");
        }else {
            System.out.println("Not!");
        }

    }
    public static int reverseNumber(int n){
        int reverse = 0;
        int sum = 0;
        while (n!=0){
            int digit=  n%10;
             reverse = reverse*10 + digit;
            sum += Math.pow(digit, 3);
            n/=10;
        }
//        return  reverse;
        return sum;
    }

}
