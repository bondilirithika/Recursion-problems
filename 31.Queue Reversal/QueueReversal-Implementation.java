class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        solve(q);
        return q;
    }
    
    void solve(Queue<Integer> q)
    {
        if(q.isEmpty())
        return;
        int temp=q.poll();
        solve(q);
        q.add(temp);
    }
}
