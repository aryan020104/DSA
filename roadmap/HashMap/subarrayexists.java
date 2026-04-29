package roadmap.HashMap;

import java.util.HashSet;

public class subarrayexists {
    public static boolean subArrayExits(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (set.contains(sum - k)) {
                return true;
            }
            set.add(sum);

        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,0,1};
        boolean results = subArrayExits(arr, 3);
        System.out.println(results);

        
    }
}