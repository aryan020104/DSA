package arraytopic;

public class maxnum {
    public static void main(String[] args) {
        int[] number = {15,16,47,55,66,54};
        System.out.println(max(number));
    }

    static int max(int[] number){
        int maxnums = number[0];
        for(int i = 0 ; i < number.length; i++){
            if(number[i] > maxnums){
                maxnums = number[i];
            }

        }
        return maxnums;

    }
    
}
