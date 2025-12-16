package graphs;

import java.util.ArrayList;

public class example {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        ArrayList<ArrayList<Integer> > image = new ArrayList<ArrayList<Integer> >();

        for (int i = 0; i <=n; i++) {
            image.add(new ArrayList<Integer>());

            image.get(1).add(2);
            image.get(2).add(1);

            image.get(2).add(3);
            image.get(3).add(2);

            image.get(1).add(3);
            image.get(3).add(1);


        }
        
            for(int i = 0; i < n; i++) {
                for(int j =0; j<image.get(i).size(); j++){
                    System.out.println(image.get(i).add(j)+"");
                }
                System.out.println("");

                
            }
            

    }
    
}
