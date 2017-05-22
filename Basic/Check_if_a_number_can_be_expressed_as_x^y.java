/*
 * http://practice.geeksforgeeks.org/problems/check-if-a-number-can-be-expressed-as-xy/0
 * Amazon, Housing.com
 */

import java.util.*;
import java.lang.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfCases = sc.nextInt();
        for(int i = 0; i< numOfCases; i++){
            sc.nextLine();
            System.out.println(checkPowerable(sc.nextInt()));
        }
    }

    public static int checkPowerable(int p){
        List<Integer> primes = getPrimes(p);
        if(analyzeDivisorList(primes)) return 1;
        else return 0;
    }

    public static List<Integer> getPrimes(int p){
        List<Integer> primes = new ArrayList<>();
        while(p % 2 == 0){
            primes.add(2);
            p = p/2;
        }
        for(int i = 3; i<=Math.sqrt(p); i++){
            while(p % i == 0){
                primes.add(i);
                p /= i;
            }
        }
        if(p > 2)
            primes.add(p);
        return primes;
    }

    public static Boolean analyzeDivisorList(List<Integer> p){
        Map<Integer, Integer> d = new HashMap<>();
        for (Integer aP : p) {
            if (d.get(aP) == null) d.put(aP, 1);
            else d.put(aP, d.get(aP) + 1);
        }
        int fact = 0, time = 0;
        for(int key : d.keySet()){
            int num = d.get(key);
            if(num<2)
                return false;
            else{
                if(time == 0)
                    fact = num;
                else{
                    if (fact != num) return false;
                }
                time++;
            }
        }
        return true;
    }
}