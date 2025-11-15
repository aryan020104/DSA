package patternpractice;

import java.util.Scanner;



public class Pattern1 {     
    public static void main(String[] args) {
      System.out.println("Enter a num: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        for(int i = 0; i<5; i++){

          for(int j = 0; j<5; j++){

            System.out.print("*");
          }
          System.out.println();
        }
}

}
