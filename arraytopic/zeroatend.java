package arraytopic;

import java.util.Arrays;

public class zeroatend {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        int[] temparr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temparr[index] = arr[i];
                index++;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temparr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

}
