package patternpractice;

public class Pattern3 {
    public static void main(String[] args) {
        
    int N = 5 ;
    // Scanner input = new Scanner(System.in);
      //  System.out.println("Enter a number");
       // int N = input.nextInt();

        for (int i = 1; i<=N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();           
        }


}
    
}
