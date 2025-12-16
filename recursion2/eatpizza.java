package recursion2;

public class eatpizza {
    public static void eatPizza(int slices) {
        if (slices == 0) {
            System.out.println("Pizza finished!");
            return;
        }
        System.out.println("Eating slice " + slices);
        eatPizza(slices - 1);
    }

    public static void main(String[] args) {
        eatPizza(5);
    }
}
