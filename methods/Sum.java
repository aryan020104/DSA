package methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum(); //function is called

        int ans = sum2(20,30);
        
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = input.nextInt();

        int sum = num1 + num2;

    System.out.println("Sum of 2 number is  "  + sum);
    }
    // pass the value of numbers
    static  int sum2(int a, int b){
        int sum = a+b;
        return sum;
    }
}


// when you write return in end of method or function it means it ends there no further process. 