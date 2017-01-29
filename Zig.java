package pset2.sol;

import java.util.*;

/**
 * Created by kit on 29/01/2017.
 */
public class Zig {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(i % 4 == 0){
                System.out.print(s.charAt(i) + "       ");
            }
        }
        System.out.println();
        for(int u = 0; u < s.length(); u++){
            if(u % 4 == 1){
                System.out.print("  " +s.charAt(u)+"   ");
            }
            else if(u % 4 == 3){
                System.out.print(s.charAt(u)+" ");
            }
        }
        System.out.println();
        for (int y= 0; y < s.length(); y++){
            if(y % 4 == 2){
                System.out.print("    "+ s.charAt(y)+"   ");
            }
        }

    }
}
