import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ich = sc.nextInt();
        switch (ich){
            case 1->{
                System.out.println("monday");
            }
            case 2->{
                System.out.println("tuesday");
            }
            case 3->{
                System.out.println("webnesday");
            }
            case 4->{
                System.out.println("thursday");
            }
            case 5->{
                System.out.println("friday");
            }
            case 6->{
                System.out.println("saturday");
            }
            case 7->{
                System.out.println("sunday");
            }
            default -> {
                System.out.println("wrong");
            }
        }
    }
}
