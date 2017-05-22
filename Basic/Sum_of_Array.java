/*
 * http://practice.geeksforgeeks.org/problems/sum-of-array/0
 */

import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            sc.nextInt();
            sc.nextLine();
            String p = sc.nextLine();
            System.out.println(Arrays.stream(Arrays.stream(p.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)).mapToInt(Integer::intValue).sum());
        }
    }
}