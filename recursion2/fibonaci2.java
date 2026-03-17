package recursion2;

public class fibonaci2 {
    public static int serie(int n) {
        if (n <= 1)
            return n;
        int last = serie(n - 1);
        int snlast = serie(n - 2);
        return last + snlast;
    }

    public static void main(String[] args) {
        System.out.println(serie(4));
    }
}
