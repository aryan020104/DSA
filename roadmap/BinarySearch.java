package roadmap;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int target = 7;

        int low = 0;
        int high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }

        }
        if (!found) {
            System.out.println("element not found");
        }

    }

}
