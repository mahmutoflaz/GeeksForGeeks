/*
 * http://practice.geeksforgeeks.org/problems/a-simple-fraction/0
 * Amazon, Microsoft
 */

import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(divideExtended(a, b));
        }
    }

    public static String divideExtended(int a, int b) {
        String cumDiv = "";
        String div = String.valueOf(a / b);
        int rem = a % b;

        if (rem == 0) return div;
        else {
            HashMap<Integer, Integer> map = new HashMap<>();
            while (rem != 0 && map.get(rem) == null) {
                map.put(rem, cumDiv.length());
                rem *= 10;
                cumDiv += (rem / b);
                rem %= b;
            }
            if (rem == 0) return div + "." + cumDiv;
            else {
                String rep = cumDiv.substring(map.get(rem));
                int posRep = cumDiv.lastIndexOf(rep);
                return div + "." + cumDiv.substring(0, posRep) + "(" + rep + ")";
            }
        }
    }
}