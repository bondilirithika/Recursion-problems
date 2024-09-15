

// User function Template for Java

class Solution {
    long c=0;
    long dp[][];
    public long count(int coins[], int N, int sum) {
        // code here.
        //two parameters are changing i and tar;
        dp=new long[N][sum+1];
        for(long[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        return sol(coins,N,sum,0);
         
    }
    //include
    //exclude
    long sol(int coins[], int n, int tar,int i)
    {
        long include=0,exclude=0;
        
        if(i>=n)
        {
            return 0;
        }
        if(dp[i][tar]!=-1)
        return dp[i][tar];
        if(tar==0)
        {
            
            return 1;
        }
        if(coins[i]<=tar)
        {
            include=sol(coins,n,tar-coins[i],i);
        }
        exclude=sol(coins,n,tar,i+1);
        dp[i][tar]=include+exclude;
        return dp[i][tar];
    }
    
}
