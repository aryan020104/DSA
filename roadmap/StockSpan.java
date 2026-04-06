package roadmap;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static int[] stockspan(int[] arr) {
        int n = arr.length;
        int result[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = i + 1;
            } else {
                result[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = stockspan(arr);

        System.out.println(Arrays.toString(span));
    }
}
