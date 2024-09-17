class Hanoi {
    long count;
    void solve(int n,int a,int b,int c)
    {
        
        if(n==1)
        {
            count++;
            System.out.println("move disk 1 from rod "+a+" to rod "+c);
            return ;
        }
        solve(n-1,a,c,b);
        count++;
        System.out.println("move disk "+n+" from rod "+a+" to rod "+c);
        solve(n-1,b,a,c);
        
        
    }

    public long toh(int n, int from, int to, int aux) {
        // Your code here
        count=0;
        solve(n,from,aux,to);
        return count;
    }
}
