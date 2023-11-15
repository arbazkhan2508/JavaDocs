import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length!");
        int l = sc.nextInt();
        System.out.println("enter width");
        int w = sc.nextInt();
        System.out.println("Area of rectangle is = " +l*w );
        System.out.println("Perimeter of rectangle is = " + 2*(l+w) );
    }
}
