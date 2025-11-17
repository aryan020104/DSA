package arraytopic;

import java.util.Scanner;

public class numexists {
    public static void main(String[] args) {
        int nooftimes = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check wheather it exists or not:");
        int num = input.nextInt();
         
        nooftimes = box(num);
        System.out.println(nooftimes);
        //System.out.println(box(int num));
    }

    static int box(int num) {
        int[] numbers = { 14, 15, 66, 55, 85, 66 };
         int count = 0;
        // boolean container = false;

        // for (int i = 0; i < numbers.length; i++) {

        // if (num == numbers[i]) {
        // container = true;
        // break;
        // }

        // }
        // if (container) { // count number repeating and to exit after desired number
        // found
        // System.out.println("Number exists!" + num);

        // } else {
        // System.out.println("Number doesnt exists:");
        // }

        for (int i = 0; i < numbers.length; i++) {

            if (num == numbers[i])

            {
               count++;

            }

        }
        return count; 

    }
}
