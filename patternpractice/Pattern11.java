package patternpractice;

public class Pattern11 {
    
    public static void main(String[] args) {
        int N = 4;

        for(int i= 65; i<N+65; i++){
            for( int j = 65 ; j<=i ;j++){

            System.out.print((char)j);
            }
            System.out.println();
        }
        
    }    
}
