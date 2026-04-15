package roadmap;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterDistance {
    public static int[] nextGreaterDistance(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int prev = stack.pop();
                result[i] = i - prev;
            }

            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 2, 9, 10 };
        int[] distance = nextGreaterDistance(arr);

        System.out.println(Arrays.toString(distance));
    }

}
