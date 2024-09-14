//WITHOUT DP:

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] ans=new long[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=fib(i);
        }
        return ans;
    }
    
    static long fib(int n)
    {
        if(n==0 || n==1)
        return 1;
        else
        return fib(n-1)+fib(n-2);
    }
}
------------------------------------------------------------------------------------------------
//WITH DP

class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] dp=new long[n];
        Arrays.fill(dp,-1);
        long[] ans=new long[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=fib(i,dp);
        }
        return ans;
    }
    
    static long fib(int n,long[] dp)
    {
        if(dp[n]!=-1)
        return dp[n];
        if(n==0 || n==1)
        {
            dp[n]=1;
            //return dp[n];
        }
        else
        {
            dp[n]=fib(n-1,dp)+fib(n-2,dp);
        }
        return dp[n];
            
    }
}
