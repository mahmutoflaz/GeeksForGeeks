/*
 * http://practice.geeksforgeeks.org/problems/series-ap/0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            int el1 = sc.nextInt();
            int el2 = sc.nextInt();
            int ref = sc.nextInt();
            System.out.println(getRefElOfSer(el1, el2, ref));
        }
    }

    public static int getRefElOfSer(int a, int b, int r){
        if(r < 1) return -1;
        if(r == 1) return a;
        if(r == 2) return b;
        int[] arr = new int[r];
        arr[0] = a;
        arr[1] = b;
        int k = 1;
        while(k++ < r-1) arr[k] = arr[k-1] + (arr[k-1] - arr[k-2]);
        return arr[r-1];
    }
}