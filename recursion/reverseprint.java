package recursion;

public class reverseprint {

    public static void reverse(int num){
        if(num < 1)return;

        System.out.println(num);
        reverse( num - 1);
    }
    public static void main(String[] args) {
        reverse(4);
    }
    
}
