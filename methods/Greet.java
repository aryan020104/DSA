package methods;

public class Greet {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap number code
        // int temp = a;
        // a = b;
        // b = temp;

        // swap(a,b);

        System.out.println(a + " " + b);
        String name = "Aryan Sorathiya";
        changeName(name);
        System.out.println(name);

    }

    // pass by value in java, no reference
    // primitves : int, string , char,,,
    // just passing value

    // object and stuff : Passing value of the object

    static void changeName(String naam) {
        System.out.println(naam);
        naam = "Aryan";
        System.out.println(naam);
    }
}
