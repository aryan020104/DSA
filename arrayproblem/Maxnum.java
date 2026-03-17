package arrayproblem;

public class Maxnum {
    public static void main(String[] args) {
        int[] arr = {4,9,2,1};
        int max = 0; 

        for(int i= 0; i<arr.length; i++){
            if(arr[i] > max){
                max= arr[i];                
            }
             System.out.println(max);
        }
        
       
    }    
}
