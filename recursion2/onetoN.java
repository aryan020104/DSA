package recursion2;

public class onetoN {
    
    public static void printNumbers(int n) {
        System.out.println(n + " ");
        if (n == 0) {
            return;
        }

        
        printNumbers(n - 1);

    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
