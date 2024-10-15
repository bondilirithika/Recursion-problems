class Solution
{
    long power(int N,int R)
    {
        //Your code here
        if(R==1)
        return N;
        long mod=1000000007;
        long halfpower=power(N,R/2)%mod;
        if(R%2==1)
        {
            return ((halfpower*halfpower)%mod)*N%mod;
        }
        else
        return (halfpower*halfpower)%mod;   
    }
}
