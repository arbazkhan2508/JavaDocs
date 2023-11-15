import java.util.Scanner;

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter isbn!");
        int isbn = sc.nextInt();
        double sum =0;
        int mul = 10;
        System.out.println(isbn);
        String numberAsString = Integer.toString(isbn);
        int length = numberAsString.length();
        if (length>=10){
             while (isbn!=0){
                 int digit = isbn%10;
                 int i = digit*mul;
                 sum+=i;
                 mul--;
                 isbn/=10;
             }
             if (sum%11==0){
                 System.out.println("valid isbn!");
             }
        }else {
            System.out.println("invalid isbn!");
        }

    }
}
