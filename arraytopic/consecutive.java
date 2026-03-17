package arraytopic;

public class consecutive {

    public static void main(String[] args) {
        int[] arr = {1,1,1, 1, 0, 1, 1, 0, 1,1,1,1,1,1,1,1,1 };
        int count = 0;
        int maxicount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;

            } else {
                count = 0;

            }

            if(maxicount < count){
                maxicount = count;
            }

        }

        System.out.println(maxicount);

    }

}
