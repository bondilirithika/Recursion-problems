class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer> p=new LinkedList<Integer>();
        while(k!=0)
        {
            int ele=q.poll();
            p.add(ele);
            k--;
        }
        reversequeue(p);
        while(!q.isEmpty())
        {
            int ele=q.poll();
            p.add(ele);
        }
        return p;
    }
    
    void reversequeue(Queue<Integer> p)
    {
        if(p.isEmpty())
        return;
        int temp=p.poll();
        reversequeue(p);
        p.add(temp);
        
    }
}
