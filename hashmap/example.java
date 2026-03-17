package hashmap;

import java.util.HashMap;

public class example {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Aryan");
        map.put(2, "Parthiv");

        String name = map.get(1);
        System.out.println("Name at 1 key  " + name);

        boolean haskey2 = map.containsKey(2);
        System.out.println(haskey2);

    }
}
