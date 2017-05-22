/*
 * http://practice.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x/0	
 * Amazon, Linkedin
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfCases = sc.nextInt();
		for(int i=0; i<numOfCases; i++){
		    int size = sc.nextInt();
		    sc.nextLine();
		    String s= sc.nextLine();
		    String[] arrS = s.split(" ");
		    int[] arr = Arrays.stream(arrS).mapToInt(Integer::parseInt).toArray();
		    int searchFor = sc.nextInt();
		    if(sc.hasNext())
		        sc.nextLine();
		    searchArray(arr, searchFor);
		}
	}
	
	public static void searchArray(int[] a, int s){
	     int f = -1, l= -1;
	     for(int i=0; i<a.length; i++){
	         if(a[i] > s) break;
	         if(a[i] == s){
	             if(f == -1) f = i;
	             l = i;
	         }
	     }
	     if(f > -1) System.out.println (f + " " + l);
	     else System.out.println (f);
	}
}