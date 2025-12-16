package arraytopic;

public class primenumber {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7, 8 };

        for (int i = 0; i < arr.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {

                    isPrime = false;
                     System.out.println(arr[i] + " " + "not prime");
                    break;
                }
               
            }

            if(isPrime){
                System.out.println(arr[i] + "  " + "Is prime");
            }else{
               System.out.println(arr[i] + " " + "not prime");
            }

        }
    }

}
