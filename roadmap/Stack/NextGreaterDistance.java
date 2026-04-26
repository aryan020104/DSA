package roadmap.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterDistance {
    public static int[] nextGreaterDistance(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int j = stack.pop();
                result[j] = i - j;
            }

            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 1, 12, 13, 2, 3, 4, 16, 111 };
        int[] greatest = nextGreaterDistance(arr);

        System.out.println(Arrays.toString(greatest));
    }

}
