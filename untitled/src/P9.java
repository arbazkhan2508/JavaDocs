import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch){
             case 'M'->{
                 System.out.println("Good mornign sir");
                 break;
             }
            case 'm'->{
                System.out.println("Good mornign sir");
                break;
            }
             case 'F' ->{
                 System.out.println("gm mam");
                 break;
             }
            case 'f' ->{
                System.out.println("gm mam");
                break;
            }
             default -> {
                System.out.println("wrong ");
                break;
            }
        }
    }
}
