/*
 * http://practice.geeksforgeeks.org/problems/angle-between-hour-and-minute-hand/0
 * Amazon, Infinera, Paytm, Sales Force
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            double h = sc.nextDouble();
            double m = sc.nextDouble();
            System.out.println(getDegree(h,m));
        }
    }

    public static int getDegree(double h, double m){
        if(m >= 60) m = 0;
        int fm = 360/60;
        int fh = 360/12;
        double dm = m*fm;
        double dh = h*fh + fh*(m/60);
        double res = Math.abs(dm-dh);
        return (res >= 180) ? (int)Math.floor(360-res) : (int)Math.floor(res);
    }
}