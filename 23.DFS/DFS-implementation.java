

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis=new int[V];
        Arrays.fill(vis,0);
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(0,vis,adj,arr);
        return arr;
    }
    
    public void dfs(int r,int[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> arr)
    {
        if(vis[r]!=1)
        {
            vis[r]=1;
            arr.add(r);
            for(int n:adj.get(r))
            {
                if(vis[n]!=1)
                dfs(n,vis,adj,arr);
            }
        }
    }
}
