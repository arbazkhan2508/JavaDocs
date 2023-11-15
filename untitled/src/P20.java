import java.util.Scanner;

public class P20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number!");
        int n = sc.nextInt();
        double sum =0;
        while (n!=0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
    }
}
