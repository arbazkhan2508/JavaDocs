import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 == n2){
            System.out.println("Equals");
        } else if (n1>n2) {
            System.out.println("first big");
        }else {
            System.out.println("Second big");
        }
    }
}
