package patterns.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    static int climbStairs(int n, Map<Integer,Integer> memo){
        if (n == 0 || n == 1) {
            return 1;
        }

        // Return the cached value immediately to avoid extra recursion
        if (memo.containsKey(n)) {
            return memo.get(n); 
        }

        int ways = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);

        memo.put(n, ways);

        return ways;
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Ways to climb " + n + " stairs : " + climbStairs(n, new HashMap<>()));
    }
}
