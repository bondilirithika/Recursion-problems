

class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n=mat.length;
        ArrayList<String> ans=new ArrayList<>();
        int[][] vis=new int[n+1][n+1];
        for(int[] c:vis)
        {
            Arrays.fill(c,0);
        }
        solve(mat,vis,ans,0,0,"");
        return ans;
    }
    
    
    void solve(int[][] mat,int[][] vis,ArrayList<String> ans,int i,int j,String str)
    {
        int n=mat.length;
        if(i==n-1 && j==n-1 && mat[i][j]==1)
        {
            ans.add(str);
            return;
        }
        if(i>=0 && i<n && j>=0 && j<n && mat[i][j]==1 && vis[i][j]==0 )
        {
            vis[i][j]=1;
            solve(mat,vis,ans,i-1,j,str+"U");
            solve(mat,vis,ans,i,j-1,str+"L");
            solve(mat,vis,ans,i+1,j,str+"D");
            solve(mat,vis,ans,i,j+1,str+"R");
            vis[i][j]=0;
        }
        
    }
}
