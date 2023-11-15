import java.util.Scanner;

public class P6 {

    public  static int fact(int n){
        int f =1;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        System.out.println(f);
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = 0;
        int temp;
        temp = n;
        int sum = 0;
        while (n!=0){
            rem = n%10;
            int f = 1;
            sum+= fact(rem);
            n/=10;
        }

        System.out.println(sum);
        if (sum == temp)
            System.out.println("Strong");
        else
            System.out.println("not");
    }
}
