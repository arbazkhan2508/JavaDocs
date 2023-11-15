import java.util.Arrays;

public class Arr8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int i =0;
        int j =n-1;
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
