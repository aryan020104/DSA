package recursion2;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        // Task = files(3)
        Scanner input = new Scanner(System.in);

        System.out.println("Option 1 = Pizzaslice:");
        System.out.println("Option 2 = Reverse counting:");
        System.out.println("Option 3 = Factorial:\n");

        System.out.println("Enter a option number:");
        int desireNum = input.nextInt();

        if (desireNum == 1) {
            System.out.println("Enter a  number:");
            int numbers = input.nextInt();
            eatpizza.eatPizza(numbers);

        } else if (desireNum == 2) {
            System.out.println("Enter a  number:");
            int numbers = input.nextInt();
            onetoN.printNumbers(numbers);

        } else if (desireNum == 3) {
            System.out.println("Enter a  number:");
            int numbers = input.nextInt();
            int Factorial = numbers;

            if (Factorial >= 0) {
                System.out.println("Entered number is +ve " + Factorial);
                System.out.println(sumofNum.sum(numbers));
            } else {
                System.out.println("Entered number is -ve " + Factorial);
            }

        } else {
            System.out.println("Enter a valid input");
        }

    }

}
