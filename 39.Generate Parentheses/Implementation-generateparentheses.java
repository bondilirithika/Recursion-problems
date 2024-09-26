class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        ArrayList<String> list=new ArrayList<>();
        solve(0,0,list,"",n);
        return list;
    }
    
    void solve(int open,int close,ArrayList<String> list,String s,int N)
    {
        if(s.length()==2*N)
        {
            list.add(s);
            return;
        }
        if(open<N)
        {
            solve(open+1,close,list,s+"(",N);
        }
        if(close<open)
        {
            solve(open,close+1,list,s+")",N);
        }
    }
}
