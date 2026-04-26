package roadmap;

public class PairSumTwoPointer {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int target = 20;

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        if (!found) {
            System.out.println("Pair not found");
        }
    }

}
