/*
 * http://practice.geeksforgeeks.org/problems/sum-of-digits/0
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
            System.out.println(sumOfDigits(num));
        }
    }

    public static int sumOfDigits(int num){
        int retVal = 0;
        while(num / 10 > 0){
            retVal += (num % 10);
            num /= 10;
        }
        return retVal += num;
    }
}