EXPLANATION INCLUDED IN COMPLEXITY ANALYSIS

//ITERATIVE WAY:
class Solution
{
    //Function to find sum of all possible substrings of the given string.
    public static long sumSubstrings(String s)
    {
    //Your code here
    long mod=1000000007;
        long lastsum=0;
        long tsum=0;
        for(int i=0;i<s.length();i++)
        {
            long currentdigit=s.charAt(i)-'0';
            lastsum=((lastsum*10)+(i+1)*currentdigit)%mod;
            tsum=(tsum+lastsum)%mod;
        }
        return tsum%mod;
    }
    
}

//RECURSIVE WAY
class Solution
{
    //Function to find sum of all possible substrings of the given string.
    static long mod=1000000007;
    public static long sumSubstrings(String s)
    {
    //Your code here
        return sum(s,0,0,0)%mod;
    }
    static long sum(String s,int i,long last,long tsum)
    {
        if(i>=s.length())
        return tsum%mod;
        
        long currentdig=s.charAt(i)-'0';
        last=((last*10)+(i+1)*currentdig)%mod;
        tsum=(tsum+last)%mod;
        return sum(s,i+1,last,tsum);
    }
    
}
