import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length!");
        int l = sc.nextInt();
        System.out.println("enter width!");
        int w = sc.nextInt();
        System.out.println(l*w + " is area of the rectangle!");
        System.out.println(2*(l+w) + " is Perimiter of the rectangle!");

    }
}
