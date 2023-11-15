import java.util.Scanner;

public class P21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number!");
        int n = sc.nextInt();
        if (isPrime(n)){
            System.out.println("prime number");
        }else{
            System.out.println("not!");
        }
    }
    public static boolean isPrime(int n){
         if (n<=1){
             return false;
         }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
                if (n%i==0){
                     return false;
                }
        }
        return true;
    }
}
