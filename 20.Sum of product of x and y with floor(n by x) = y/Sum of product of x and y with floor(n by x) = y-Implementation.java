class Solution
{
    public long sumofproduct(int n)
    {
        // code here
        return solve(n,1,0);
    }
    
    long solve(int n,int x,long sum)
    {
        if(x>n)
        return sum;
        sum+=x*(n/x);
        return solve(n,x+1,sum);
    }
}
