public class Arr2 {
    public static void main(String[] args) {
        int arr[] = {2, 96, 69, 77, 145, 20};
        int max = arr[0];
        int maxIndex =0;
        for (int i = 0; i < arr.length; i++) {
              if (arr[i]>max){
                   max = arr[i];
                   maxIndex = 1;
              }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
