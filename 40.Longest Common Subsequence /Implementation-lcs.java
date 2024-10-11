class Solution {
    // Function to find the length of longest common subsequence in two strings.
    static int lcs(int n, int m, String str1, String str2) {
        // your code here
    
    //lcs
    //if same then we move the pointers
    //else we can move the pointer to the string 1 or string 2
    //in most of the problems when 2 strings are given take two pointers
    int[][] dp=new int[n+1][m+1];
    for(int[] c:dp)
    {
        Arrays.fill(c,-1);
    }
    return solve(n,m,str1,str2,0,0,dp);
    }
    
    static int solve(int n, int m, String str1, String str2,int i,int j,int[][] dp)
    {
        if(i>=n || j>=m)
        return 0;
        
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(str1.charAt(i)==str2.charAt(j))
        {
            int len=1+solve(n,m,str1,str2,i+1,j+1,dp);
            dp[i][j]= len;
            return dp[i][j];
        }
        
        else
        {
            int len1=solve(n,m,str1,str2,i+1,j,dp);
            int len2=solve(n,m,str1,str2,i,j+1,dp);
            dp[i][j]= Math.max(len1,len2);
            return dp[i][j];
        }
    }
}
