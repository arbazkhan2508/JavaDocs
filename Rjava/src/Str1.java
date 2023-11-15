import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Enter any String:");
        for (int i = s.length()-1; i >-1; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
