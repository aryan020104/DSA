package roadmap;

public class Binarytarget {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9 };
        int target = 7;
        int mid;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Target found at index " + mid);
                return;

            }
            if (arr[mid] < target) {

                low = mid + 1;
            }
            if (arr[mid] > target) {

                high = mid - 1;
            }
        }
        System.out.println("target found");

    }

}
