class Solution
{
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        return solve(n,s,dictionary,0);
    }
    
    static int solve(int n,String s,ArrayList<String> map,int ind)
    {
        if(ind>=s.length())
        { //System.out.println("base "+j);
          return 1;
        }
        for(int j=ind;j<s.length();j++)
            {
                String a=s.substring(ind,j+1);
                if(map.contains(a))
                {
                    //System.out.println("here "+j);
                    if(solve(n,s,map,j+1)==1)
                    return 1;
                }
            }
        return 0;
    }
       
    
}
