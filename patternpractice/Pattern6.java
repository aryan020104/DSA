package patternpractice;

public class Pattern6 {
    public static void main(String[] args) {
        int N = 10;
        
        for(int i = N; i>0; i--){

            // for(int j = 0; j<i; j++){

            //     System.out.print(i+" ");
            // }
            // System.out.println();

            for(int j = 0; j<= N-i ;  j++){

                System.out.print(i+" ");

            }
            System.out.println();
        }
      
    }
    
}
