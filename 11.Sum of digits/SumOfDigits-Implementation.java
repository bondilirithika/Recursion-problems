class Solution{
    static int sumOfDigits(int n) {
        // code here
        return solve(n,0);
    }
    static int solve(int n,int res)
    {
        if(n==0)
        return res;
        res+=n%10;
        n=n/10;
        return solve(n,res);
    }
}
