/*
 * http://practice.geeksforgeeks.org/problems/number-is-sparse-or-not/0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            int num = sc.nextInt();
            System.out.println(checkSparse(num));
        }
    }

    public static int checkSparse(int num){
        int prev = 0;
        while(num > 0){
            if(prev == 1 && num % 2 == 1) return 0;
            prev = num % 2;
            num /= 2;
        }
        if (num == 1 && prev == 1) return 0;
        return 1;
    }
}