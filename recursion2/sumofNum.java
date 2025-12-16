package recursion2;

import java.util.Scanner;

public class sumofNum { // Factorail
    public static int sum(int n) {

        if (n == 0) {
            return 1;
        }
        return n * sum(n - 1);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();



        if(number >= 0){
            System.out.println("Entered number is +ve " + number);
            System.out.println(sum(number));
        }else{
            System.out.println("Entered number is -ve " + number);
            
        }

    }

}
