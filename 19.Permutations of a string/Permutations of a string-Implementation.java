class Solution {
    public List<String> find_permutation(String str) {
        // Code here
        ArrayList<String> ans=new ArrayList<>();
        int[] vis=new int[str.length()];
        Arrays.fill(vis,0);
        solve(str,ans,"",vis);
        Collections.sort(ans);
        return ans;
    }
    
    void solve(String str,ArrayList<String> ans,String s,int[] vis)
    {
        if(s.length()==str.length())
        {
            if(!ans.contains(s))
            ans.add(s);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            if(vis[i]==0)
            {
                vis[i]=1;
                solve(str,ans,s+str.charAt(i),vis);
                vis[i]=0;
            }
        }
    }
}
