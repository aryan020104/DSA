package arrayproblem;

public class sumofnum {
    public static void main(String[] args) {
        int[] arr = { 8, 15, 3, 10, 7 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
