package roadmap;

public class SumofK {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        int windowsum = 0;

        for (int i = 0; i < k; i++) {

            windowsum = windowsum + arr[i];

        }
        maxSum = windowsum;
        for (int i = k; i < n; i++) {

            windowsum = windowsum + arr[i] - arr[i - k];
            if (windowsum > maxSum)
                maxSum = windowsum;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 8, 9, 10, 1, 2, 3 };
        int k = 3;
        int Maximumsum = maxSumSubarray(arr, k);

        System.out.println(Maximumsum);
    }
}
