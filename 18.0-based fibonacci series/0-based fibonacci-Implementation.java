class Solution {

    int mod=1000000007;
    int[] Series(int n) {
        // code here
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=fib(i,dp)%mod;
        }
        return ans;
    }
    
    int fib(int n,int[] dp)
    {
        if(dp[n]!=-1)
        return dp[n];
        if(n==0 || n==1)
        return n;
        return dp[n]=fib(n-1,dp)%mod+fib(n-2,dp)%mod;
    }
}
