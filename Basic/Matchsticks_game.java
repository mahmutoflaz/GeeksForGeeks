/*
 * http://practice.geeksforgeeks.org/problems/-matchsticks-game/0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static final int MIN_GET = 1;
    public static final int MAX_GET = 4;
    
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            int numOfSticks = sc.nextInt();
            System.out.println(stickGameHack(numOfSticks));
        }
    }

    public static int stickGameHack(int numOfSticks){
        return (numOfSticks % (MIN_GET + MAX_GET) > 0) ? numOfSticks % (MIN_GET + MAX_GET) : -1;
    }
}