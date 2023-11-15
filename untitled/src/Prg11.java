import java.util.Scanner;

public class Prg11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name !");
        String n = sc.nextLine();
        System.out.println("enter age");
        int a = sc.nextInt();

        if (a>=18){
            System.out.println("you can vote!");
        }else {
            System.out.println("you can't vote!");
        }

    }
}
