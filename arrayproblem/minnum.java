package arrayproblem;

public class minnum {

    public static void main(String[] args) {
        int[] arr = { 8, 3, 5, 2, 9 };
        int minnumber = arr[0];
        int finalans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minnumber) {
                minnumber = arr[i];
            }
        }
        finalans = minnumber;
        System.out.println("Final answer:" + finalans);
    }
}
