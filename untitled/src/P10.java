import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number!");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("Even number!");
        }else {
            System.out.println("its odd!");
        }
    }
}
