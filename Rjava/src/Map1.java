import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,2,3,3,2,3,3};
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int e:arr) {
            if (map.containsKey(e)){
                int old = map.get(e);
                int newCount = old+1;
                map.put(e, newCount);
            }else {
                map.put(e,1);
            }
        }

        System.out.println(map);

    }
}
