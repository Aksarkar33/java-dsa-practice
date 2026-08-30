package patterns.dynamic_programming;

public class HouseRobber {
    static int rob(int[] num){
        if(num==null || num.length==0) return 0;
        if(num.length==1) return num[0];

        int prev2=0;
        int prev1=0;

        for(int currentHouseMoney : num){
            int currentMax=Math.max(currentHouseMoney+prev2, prev1);

            prev2=prev1;
            prev1=currentMax;
        }
        return prev1;
    }
     public static void main(String[] args) {
        int[] houses = {2, 7, 9, 3, 1};
        System.out.println("Maximum stolen money: " + rob(houses));
       
    }
}
