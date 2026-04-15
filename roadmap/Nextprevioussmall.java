package roadmap;

import java.util.Arrays;
import java.util.Stack;

public class Nextprevioussmall {
    public static int[] previousSmaller(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(i);

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 9, 2, 3, 1, 10 };
        int[] distance = previousSmaller(arr);
        System.out.println(Arrays.toString(distance));
    }

}
