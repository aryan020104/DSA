package arraytopic;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {

        Scanner intput = new Scanner(System.in);
        System.out.println("Enter a no of terms:");
        int number = intput.nextInt();
        int term1 = 0;
        int term2 = 1;

        int next = term1 + term2;
        System.out.print(term1 + ",");
        System.out.print(term2 + ",");

        for (int i = 0; i < number-2; i++) {
            if(i == number-3){
                 System.out.print(next);
            }else{
                System.out.print(next + ",");
            }
           
            term1 = term2;
            term2 = next;
            next = term1 + term2;
             
            
        }
       
    }

}
