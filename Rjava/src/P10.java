import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        char ch = sc.next().charAt(0);
        switch (ch){
             case 'a'->{
                 System.out.println("Its vowel!");
             }
            default -> System.out.println("consonent");
        }

    }
}
