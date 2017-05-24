/*
 * http://practice.geeksforgeeks.org/problems/find-the-odd-occurence/0
 * Amazon, Snapdeal
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
            System.out.println(findOdd(Arrays.stream(p.split(" ")).map(Integer::parseInt).toArray(Integer[]::new)));
        }
    }

    public static Integer findOdd(Integer[] arr){
        int res = 0;
        for(Integer i : arr) res = res ^ i;
        return res;
    }
}