class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        solve(s);
        return s;
    }
    
    void solve(Stack<Integer> s)
    {
        if(s.isEmpty())
        return;
        int temp=s.pop();
        solve(s);
        sort(s,temp);
    }
    
    void sort(Stack<Integer> s,int temp)
    {
        if(s.isEmpty() ||temp>s.peek())
        {
            s.push(temp);
            return;
        }
        int n=s.pop();
        sort(s,temp);
        s.push(n);
    }
}
