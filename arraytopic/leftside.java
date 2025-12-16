package arraytopic;

public class leftside {
    public static void main(String[] args) {

        int[] numbers = { 1, 5, 6, 7, 8, 9,10};

        int tempnum = numbers[0];

        for (int idx = 1; idx < numbers.length; idx++) {

            numbers[idx - 1] = numbers[idx];

        }

        numbers[numbers.length - 1] = tempnum;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

    }

}
