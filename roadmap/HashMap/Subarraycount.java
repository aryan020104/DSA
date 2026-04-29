package roadmap.HashMap;

import java.util.HashMap;

public class Subarraycount {

    public static int countArray(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        int sum = 0;
        int count = 0;

        for(int i =0; i < arr.length; i++){
            sum += arr[i];

            if(map.containsKey(sum - k)){
                count = map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum,0 ) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,1,2,3};
        int results = countArray(arr,3);

        System.out.println(results);
     }
}
