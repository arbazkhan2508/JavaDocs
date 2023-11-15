import java.util.Scanner;

public class P19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number!");
        int n = sc.nextInt();
         double sum = 0;
        for (int i = 1; i <=n; i++) {
            if (n%i==0){
                System.out.println(i);
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
