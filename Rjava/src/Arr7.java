import java.util.Arrays;
import java.util.Scanner;

public class Arr7 {
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5};
       int n= arr.length;
        int k=2;
        for (int l = 0; l <k ; l++) {
            int str = arr[0];
            for (int j = 0; j <n-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[n-1] = str;
        }

        System.out.println(Arrays.toString(arr));
    }
}
