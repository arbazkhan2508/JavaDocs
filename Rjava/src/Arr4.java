import java.util.Arrays;

public class Arr4 {

    public  static boolean isSort(int[] arr){
         int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i]>arr[i+1]){
                 return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] ascendingArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {1, 3, 2, 4, 5};
        boolean isAscendingSorted = isSort(ascendingArray);
        boolean isUnsorted = isSort(unsortedArray);


    }
}
