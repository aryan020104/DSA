package patternpractice;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        System.out.println("Enter a num:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        for(int row = 1; row<=num ; row++){

            for(int col = 5; col>=row ; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
