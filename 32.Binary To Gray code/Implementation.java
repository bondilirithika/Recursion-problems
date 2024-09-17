//User function Template for Java
//ITERATIVE APPROACH
class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        String a=Integer.toBinaryString(n);
        StringBuilder ans=new StringBuilder();
        ans.append(a.charAt(0));
        for(int i=1;i<a.length();i++)
        {
            int t=ans.charAt(i-1)-'0';
            int k=a.charAt(i)-'0';
            int r=t^k;
            ans.append(r);
        }
        
        return Integer.parseInt(ans.toString(),2);
    }
       
}

-----------------------------------------------------------------------------------------------------------------

//RECURSIVE APPROACH
  //User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
        String a=Integer.toBinaryString(n);
        StringBuilder ans=new StringBuilder();
        ans.append(a.charAt(0));
        solve(a,ans,1);
        
        return Integer.parseInt(ans.toString(),2);
    }
    
    static void solve(String a,StringBuilder ans,int i)
    {
        if(i>=a.length())
        return;
        
        int t=ans.charAt(i-1)-'0';
        int k=a.charAt(i)-'0';
        int r=t^k;
        ans.append(r);
        solve(a,ans,i+1);
    }
}

