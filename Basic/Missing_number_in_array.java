/*
 * http://practice.geeksforgeeks.org/problems/missing-number-in-array/0
 * Amazon, Cisco, Microsoft, Payu
 */
 
 import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i< numOfCases; i++){
            sc.nextLine();
            String arrS = sc.nextLine();
            int[] arr = Arrays.stream(arrS.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(func(arr, 0, arr.length - 1));
        }
    }

    public static int func(int[] arr, int s, int f){
        int m = (s + f) / 2;
        if(arr[s] == s + 1)
            if(arr[m] == m+1) return func(arr, m +1, f);
            else return func(arr, 0, m-1);
        else return s+1;
    }
}