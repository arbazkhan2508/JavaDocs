import java.util.Scanner;

public class P23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        int n = sc.nextInt();
        if (isLeep(n)){
            System.out.println("leep");
        }else {
            System.out.println("not");
        }
    }
    public static boolean isLeep(int n){
         return (n%4 == 0 && n%100 != 0)||(n%400 ==0 );
    }
}
