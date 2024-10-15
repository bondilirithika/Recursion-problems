class Solution
{
    public int find(int n)
    {
        // code here
        return solve(1,n,0);
    }
    int solve(int i,int n,int sum)
    {
        sum+=i;
        if(sum==n)
        return i;
        else if(sum>n)
        return -1;
        else
        return solve(i+1,n,sum);
    }
}
