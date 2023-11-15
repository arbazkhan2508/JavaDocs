import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character!");
        char ich = sc.next().charAt(0);
        switch (ich){
            case 'a'->{
                System.out.println("Its vowel!");
            }
            case 'e'->{
                System.out.println("Its vowel!");
            }
            case 'i'->{
                System.out.println("Its vowel!");
            }
            case 'o'->{
                System.out.println("Its vowel!");
            }
            case 'u'->{
                System.out.println("Its vowel!");
            }
            case 'A'->{
                System.out.println("Its vowel!");
            }
            case 'E'->{
                System.out.println("Its vowel!");
            }
            case 'I'->{
                System.out.println("Its vowel!");
            }
            case 'O'->{
                System.out.println("Its vowel!");
            }
            case 'U'->{
                System.out.println("Its vowel!");
            }default -> {
                System.out.println("wrong consonent!");
            }
        }
    }
}
