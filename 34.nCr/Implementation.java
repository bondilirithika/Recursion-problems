

// User function Template for Java

class Solution{
    static int mod=1000000007;
    static int nCr(int n, int r)
    {
        // code here
        int[][] dp=new int[n+1][r+1];
        for(int[] a:dp)
        {
            Arrays.fill(a,-1);
        }
        return solve(n,r,dp);
        
    }
    
    static int solve(int n,int r,int[][] dp)
    {
        if(dp[n][r]!=-1)
        return dp[n][r];
        if(r==0)
        return 1;
        if(r>n)
        return 0;
        
        return dp[n][r]=((solve(n-1,r-1,dp))%mod+(solve(n-1,r,dp))%mod)%mod;
    }
}
