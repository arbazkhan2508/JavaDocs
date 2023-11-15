import java.util.Arrays;
import java.util.Scanner;

public class Arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int copy[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >=0; i--) {
            copy[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(copy));
    }
}
