import java.util.Scanner;

public class Prg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in f!");
        int f = sc.nextInt();
        System.out.println(((f-32)*5)/9);
    }
}
