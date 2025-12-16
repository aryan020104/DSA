package recursion;

public class reverseonetime {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 4, 7, 80 };
        int j = arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        reverse(0, arr, j);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int i, int[] arr, int j) {

        if (i >= j / 2)
            return;
        swap(arr, i, j - i - 1);
        reverse(i + 1, arr, j);
    }

}
