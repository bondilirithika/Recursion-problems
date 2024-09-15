// BRUTE FORCE
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        int res=0;
        for(int i=1;i<=n;i++)
        {
            int set=num(Integer.toBinaryString(i),0,0);
            res+=set;
        }
        return res;
        
    }
    
    static int num(String bin,int i,int count)
    {
        int n=bin.length();
        if(i>=n)
        return count;
        if(bin.charAt(i)=='1')
        {
            return num(bin,i+1,count+1);
        }
        else
        return num(bin,i+1,count);
       
    }
    
}

//OPTIMAL

//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        if(n==0)
        return 0;
        int x=largestpowerof2(n);
        int setbitsbeforex=x*(1<<(x-1));
        int msbsfromxton=(n-(1<<x))+1;
        int rest=n-(1<<x);
        int ans=setbitsbeforex+msbsfromxton+countSetBits(rest);
        return ans;
        
    }
    
    static int largestpowerof2(int n)
    {
        int x=0;
        while((1<<x)<=n)
        {
            x++;
        }
        return x-1;
        
    }
}
