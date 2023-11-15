import java.util.Arrays;

public class Arr11 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-3,-43,4,-5,4,-54,34};
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
