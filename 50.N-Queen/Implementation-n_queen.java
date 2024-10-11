// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        int[][] chess=new int[n][n];
        //Arrays.fill(chess,0);
        solve(ans,n,new ArrayList<Integer>(),0,chess);
        return ans;
    }
    
    void solve(ArrayList<ArrayList<Integer>> ans,int n,ArrayList<Integer> list,int col,int[][] chess)
    {
        if(col==n)
        {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(issafe(i,col,chess))
            {
                chess[i][col]=1;
                list.add(i+1);
                solve(ans,n,list,col+1,chess);
                list.remove(list.size()-1);
                chess[i][col]=0;
            }
        }
    }
    
    boolean issafe(int row,int col,int[][] chess)
    {
        int duprow=row;
        int dupcol=col;
        //up left diagonol
        while(duprow>=0 && dupcol>=0)
        {
            if(chess[duprow][dupcol]==1)
            return false;
            duprow--;
            dupcol--;
        }
        
        duprow=row;
        dupcol=col;
        while(dupcol>=0)
        {
            if(chess[duprow][dupcol]==1)
            return false;
            dupcol--;
        }
        
        dupcol=col;
        while(duprow<chess.length && dupcol>=0)
        {
            if(chess[duprow][dupcol]==1)
            return false;
            duprow++;
            dupcol--;
        }
        
        return true;
    }
}
