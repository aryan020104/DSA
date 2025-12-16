package recursion;

public class factorial {

    public static int fact(int n, int accumulater) {
        if (n == 1)
            return accumulater;
        return fact(n - 1, accumulater * n);
    }

    public static void main(String[] args) {
      System.out.println(fact(5, 1));
    }

}
