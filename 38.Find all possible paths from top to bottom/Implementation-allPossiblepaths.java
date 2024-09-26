class Solution {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n,int m, int[][] grid) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.add(grid[0][0]);
        solve(n,m,grid,arr,temp,0,0);
        return arr;
    }
    
    static void solve(int n,int m,int[][] grid,ArrayList<ArrayList<Integer>> arr,ArrayList<Integer> temp,int i,int j)
    {
        
        if(i==n-1 && j==m-1)
        {
            arr.add(new ArrayList<Integer>(temp));
            return;
        }
        
        //we can move right or down
        if(i+1<n && j<m){
        temp.add(grid[i+1][j]);
        solve(n,m,grid,arr,temp,i+1,j);
        temp.remove(temp.size()-1);
        }
        if(i<n && j+1<m){
        temp.add(grid[i][j+1]);
        solve(n,m,grid,arr,temp,i,j+1);
        temp.remove(temp.size()-1);
        }
    }
}
