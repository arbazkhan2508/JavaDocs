import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number!");
        int n1 = sc.nextInt();
        System.out.println("Enter second Number!");
        int n2 = sc.nextInt();

        if (n1>n2){
            System.out.println("first big");
        }else {
            System.out.println("second big!");
        }
    }
}
