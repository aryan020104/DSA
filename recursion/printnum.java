package recursion;

public class printnum {

    public static void num(int n){
        if(n>5)return;
        System.out.println(n);
        num(n + 1);
    }
    public static void main(String[] args) {
        num(1);
    }
    
}
