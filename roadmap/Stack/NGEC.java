package roadmap.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NGEC {
    public static int[] nextGreaterCircular(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i % n]) {
                stack.pop();

            }

            if (i < n) {

                if (stack.isEmpty()) {
                    result[i] = -1;
                } else {
                    result[i] = stack.peek();
                }

            }
            stack.push(arr[i % n]);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int[] res = nextGreaterCircular(arr);

        System.out.println((Arrays.toString(res)));
    }

}
