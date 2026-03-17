package arrayproblem;

public class countnum {

    public static void main(String[] args) {
        int[] arr = { 4, 12, 7, 20, 5, 15 };
        int count = 0;
        int numberGreater = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
            numberGreater = count;
            System.out.println(numberGreater);
        }
        System.out.println("Final Answer:" + numberGreater);
    }

}
