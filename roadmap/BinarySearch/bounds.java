package roadmap;

public class bounds {
    public static void main(String[] args) {
    }

    public int lowerbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public int upperbound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int countOccurrences(int[] arr, int target) {
        int lb = lowerbound(arr, target);
        int ub = upperbound(arr, target);
        int count = ub - lb;
        return count;
    }
}
