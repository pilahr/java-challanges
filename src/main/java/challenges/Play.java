package challenges;

import java.util.Arrays;
import java.util.LinkedList;

public class Play {

    public static void main(String[] args) {
        int amount = 6;
        int[] coins = {5,3};

        System.out.println(coinChange(coins, amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[]dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        int a;

        for(a=1;a<amount+1;a++) // 1 2 3 4 5 6
        {

            for(int c:coins) // 5 3

            {
                if(a-c>=0)
                {
                    System.out.println(a);
                    System.out.println(c);
                    System.out.println("a "  + dp[a]);
                    System.out.println("a-c "  + (1+dp[a-c]));

                    dp[a]=Math.min(dp[a],1+dp[a-c]);
                    System.out.println("dp[a]: " + dp[a]);
                    System.out.println("======");
                }

            }
        }
        if(dp[amount]!=amount+1)
        {
            return dp[amount];
        }
        else
        {
            return -1;
        }
    }
//        for(int c:coins){ // 3 5
//            for(int i=c;i<=amount;i++){ // 3 4 5 6
//                dp[i]=Math.min(dp[i],dp[i-c]+1);
//
//                System.out.println(dp[i]);
//                System.out.println("i= "+i+ "  c= "+ c +"--print " +dp[i-c]+1);
//
//            }
//        }
//        System.out.println("Amount " + dp[amount]);
//        return dp[amount]<=amount ? dp[amount] : -1;
//    }
//    public static int coinChange(int[] coins, int amount) {
//
//        int []dp = new int[amount+1];
//        Arrays.fill(dp,-1);
//        dp[0]= 0;
//        int res = dp(coins,amount,dp);
//        return res;
//    }
//
//    public static int dp(int[] array, int amount, int[] dp) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array[i]; j<dp.length; j++) {
//
//                if(dp[j] == -1) {
//                    if (dp[j-array[i]] != -1) {
//                        dp[j] = dp[j-array[i]] +1;
//                    }
//                } else {
//                    if (dp[j-array[i]] != -1) {
//                        dp[j] = Math.min(dp[j-array[i]] + 1, dp[j]);
//                    }
//                }
//            }
//        }
//        return dp[dp.length-1];
//
//    }
}
