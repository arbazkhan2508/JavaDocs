import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        int s = (s1+s2+s3)/2;
        double res = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println(res);
    }
}
