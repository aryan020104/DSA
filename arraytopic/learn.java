package arraytopic;

import java.util.Scanner;

public class learn {
    public static void main(String[] args) {
       float total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int num1 = input.nextInt();

        System.out.println("Enter b:");
        int num2 = input.nextInt();

        total = add(num1, num2);
   
        System.out.println(total);
        
    }
    static float add(int a , int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
        
    }
      
}
