package roadmap;

public class SearchInsert {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6 };
        int target = 0;

        int left = 0;
        int right = arr.length - 1;
        int ans = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;

            } else {
                left = mid + 1;
            }

        }
        System.out.println(ans);
    }

}
