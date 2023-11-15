public class Arr9 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 121;

        for (int i = 0; i < arr.length; i++) {
             if (arr[i]==target){
                 System.out.println(i);
                 return;
             }
        }
        System.out.println("-1");
    }
}
