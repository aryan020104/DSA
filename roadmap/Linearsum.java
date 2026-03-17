package roadmap;

public class Linearsum {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 2, 9 };
        int target = 2;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Target found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target not found");
        }
    }

}
