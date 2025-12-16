package recursion;

public class linearlyprint {

    public static void name(String naam, int count){
        if(count > 5)return;

        System.out.println(naam);
        name(naam,count+1);

    }
    public static void main(String[] args) {
        name("Aryan",1);
    }    
}
