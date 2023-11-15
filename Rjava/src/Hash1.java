import java.util.HashSet;

public class Hash1 {
    public static void main(String[] args) {
        int arr[] = {4,1,2,5,5,3,4,5,54,6,7,4,3};
        HashSet<Integer> set = new HashSet<>();
        for (int e:arr)set.add(e);
        System.out.println(set);
    }
}
