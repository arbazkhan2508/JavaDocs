import java.util.Scanner;

public class Arr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 96, 69, 77, 145, 20};
        int max = arr[0];
        int secondMax = arr[1];
        for (int i = 0; i < arr.length; i++) {
             if (arr[i]>max){
                 secondMax=max;
                  max=arr[i];
             } else if (arr[i]>secondMax && arr[i]!=max) {
                 secondMax= arr[i];
             }
        }
        System.out.println(secondMax);
    }
}
