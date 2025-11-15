package methods;

import java.util.Scanner;

public class Armstrongque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  armstorng number:");
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n) 
    {
        int orginal = n;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem *rem *rem;
        }
        return sum == orginal;
    }

}
