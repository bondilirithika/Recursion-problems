class Solution{
    ArrayList<Long> absDifOne(long N){
        ArrayList<Long> ans=new ArrayList<Long>();
        for(long i=1;i<=9;i++)
        {
            solve(N,ans,i);
        }
        Collections.sort(ans);
        return ans;
    }
    
    void solve(long N,ArrayList<Long> ans,long n)
    {
        //long n=q.poll();
        // if(n>N)
        // return;
            long lastdig=n%10;
             if (n >= 10 && n <= N) {
                ans.add(n); 
            }
            if(n<=N)
            {
                if(lastdig==0)
                {
                    long num=n*10+lastdig+1;
                    if(num<=N)
                    {
                    solve(N,ans,num);
                    }
                }
                else if(lastdig==9)
                {
                    long num=n*10+8;
                    if(num<=N)
                    {
                    solve(N,ans,num);
                   
                    }
                }
                else
                {
                    long num1=n*10+lastdig+1;
                    long num2=n*10+lastdig-1;
                    if(num1<=N)
                    {
                    solve(N,ans,num1);
                    
                    }
                    if(num2<=N )
                    {
                    solve(N,ans,num2);
                   
                    }
                }
            }
            
        }
    }
