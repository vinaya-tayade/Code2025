package com.april.seventh;
/*
 * Given a set of coins and a total amount, find how many ways you can make the total using those coins.
 */
public class CoinChange {
	public static int countWays(int[] coins,int amount){
		int[] dp =new int[amount+1];
		dp[0]=1;
		for(int coin : coins) {
			for(int i=coin;i<=amount;i++) {
				dp[i]+=dp[i-coin];
			}
		}
		return amount;
		
	}
public static void main(String[] args) {
	int[] coins= {1,2,5};
	int amt=5;
	int waays=countWays(coins, amt);
	System.out.println("No of ways to make change for "+amt+" is: "+waays);
}
}
