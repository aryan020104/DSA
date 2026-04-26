package roadmap.Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public static int[] DistanceTemp(int[] arr) {
        int[] temp = arr;
        int[] ans = new int[temp.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temp.length; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int prev = stack.pop();
                ans[prev] = i - prev;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] finaltemp = DistanceTemp(arr);

        System.out.println(Arrays.toString(finaltemp));
    }
}
