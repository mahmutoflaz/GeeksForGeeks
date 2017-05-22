/*
 * http://practice.geeksforgeeks.org/problems/geek-and-coffee-shop/0
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
		    int times = sc.nextInt();
		    System.out.println(drink(start,times));
		}
	}
	
	public static int drink(int start, int times){
	    int[] drinks = new int[times];
	    drinks[0] = start;
	    for(int i = 0; i<times-1; i++)
	        drinks[i+1] = drinks[i]/2;
	    return drinks[times-1];
	}
}