package arraytopic;

public class oddeven {
    public static void main(String[] args) {
        int[] number = {1,3,2,5,6,10,9};

            for(int i =0 ; i< number.length ; i++){

                if(number[i] % 2 == 0){
                    System.out.println("even");
                }else{
                    System.out.println("odd");
                }

            }
    }
    
}
