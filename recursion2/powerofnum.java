package recursion2;

public class powerofnum {
    public static int express(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return (int) Math.pow(base, exp);
    }

    public static void main(String[] args) {
        System.out.println(express(3, 3));
    }
}
