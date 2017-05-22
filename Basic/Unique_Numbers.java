/*
 * http://practice.geeksforgeeks.org/problems/unique-numbers/0
 * Amazon
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i<num; i++){
		    int start = sc.nextInt();
		    int finish = sc.nextInt();
		    test(start,finish);
		}
	}
	
	public static void test(int start, int finish){
	    for(int i=start; i<=finish; i++){
	        if(testNumber(i))
	            System.out.print(i + " ");
	    }
	    System.out.println("");
	}
	public static Boolean testNumber(int num){
	    if(num<10)
	        return true;
	    else if (num<100){
	        //System.out.print(" % ");
	        int i1 = num/10;
	        int i2 = num%10;
	        if(i1 != i2)
	            return true;
	    }
	    else if(num<1000){
	        int i1 = num/100;
	        int i2 = (num%100)/10;
	        int i3 = (num % 10);
	        
	        if(i1 != i2 && i2 != i3 && i1 != i3)
	            return true;
	    }
	    return false;
	}
}