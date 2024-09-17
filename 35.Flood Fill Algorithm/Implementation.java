class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
        int[][] ans=image;
        int r[]={-1,0,+1,0};
        int c[]={0,-1,0,+1};
        solve(image,ans,sr,sc,newColor,image[sr][sc],r,c);
        return ans;
    }
    
    void solve(int[][] image,int[][] ans, int sr, int sc, int newColor,int inicolor,int[] row,int[] col)
    {
        int r=image.length;
        int c=image[0].length;
        //ans[sr][sc]=newColor;
        if(sr>=0 && sr<r && sc>=0 && sc<c && image[sr][sc]==inicolor && ans[sr][sc]!=newColor)
        {
            ans[sr][sc]=newColor;
            for(int i=0;i<4;i++)
            {
                //System.out.println("here");
                int nr=sr+row[i];
                int nc=sc+col[i];
                solve(image,ans,nr,nc,newColor,inicolor,row,col);
            }
        }
    }
}
