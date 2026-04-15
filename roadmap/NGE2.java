package roadmap;

import java.util.Arrays;
import java.util.Stack;

public class NGE2 {

    public static int[] NextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] ans = { 5, 6, 7, 2, 9, 10 };
        int[] result = NextGreater(ans);

        System.out.println(Arrays.toString(result));
    }

}
