import java.util.Arrays;

public class Arr6 {

    public static void leftRotateByOne(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(arr));

        leftRotateByOne(arr);

        System.out.println("Array after left rotation by 1: " + Arrays.toString(arr));
    }
}
