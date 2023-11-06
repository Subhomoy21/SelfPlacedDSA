package Mathematics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class QuadraticEquation {
    static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list=new ArrayList<Integer> ();

        double d= (b*b)-(4*a*c);
        if(d<0){
            list.add(-1);
        }
        else{

            int x = (int)Math.floor((-1*b+Math.sqrt(d))/(2*a));
            int y = (int)Math.floor((-1*b-Math.sqrt(d))/(2*a));

            list.add((Math.max(x,y)));
            list.add((Math.min(x,y)));
        }

        return list;
    }
    public static void main(String[] args) {
        System.out.println((quadraticRoots(1,-2,1)));
    }
}
