package hashmap;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 3 };

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int occur : arr) {
            freq.put(occur, freq.getOrDefault(occur, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + "->" + e.getValue());

        }
    }
}
