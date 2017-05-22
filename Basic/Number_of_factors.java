/*
 * http://practice.geeksforgeeks.org/problems/number-of-factors/0
 */

import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            int p = sc.nextInt();
            System.out.println(getDivisors(p));
        }
    }

    public static int getDivisors(int p){
        int numOfDivisors = 2;
        for(int i = 2; i<=p/2; i++)
            if(p % i == 0)
                numOfDivisors++;
        return numOfDivisors;
    }
}