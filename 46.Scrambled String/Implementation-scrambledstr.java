class Solution{
    static boolean isScramble(String S1,String S2)
    {
        //code here
        HashMap<String,Boolean> map=new HashMap<String,Boolean>();
        if(S1.equals(S2))
        {
            return true;
        }
        return solve(S1,S2,map);
    }
    
    static boolean solve(String s1,String s2,HashMap<String,Boolean> map)
    {
        
        int n=s1.length();
        String a=s1+"_"+s2;
        
        if(map.containsKey(a))
        return map.get(a);
        
        if(s1.equals(s2))
        {
            map.put(a,true);
            return map.get(a);
        } 
        
       
        
        for(int i=1;i<n;i++)
        {
            if(solve(s1.substring(0,i),s2.substring(0,i),map) && solve(s1.substring(i,n),s2.substring(i,n),map))
            {
                map.put(a,true);
                return map.get(a);
            } 
            // n-i because if we have coder and i=2->it takes co and from ocder we have to take the last two ie,er
            if(solve(s1.substring(0,i),s2.substring(n-i,n),map) && solve(s1.substring(i,n),s2.substring(0,n-i),map))
            {
                map.put(a,true);
                return map.get(a);
            }
        }
        map.put(a,false);
        return map.get(a);
    }
}
