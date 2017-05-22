/*
 * http://practice.geeksforgeeks.org/problems/sum-of-series/0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            int p = sc.nextInt();
            System.out.println((p)*(p+1)/2);
        }
    }
}