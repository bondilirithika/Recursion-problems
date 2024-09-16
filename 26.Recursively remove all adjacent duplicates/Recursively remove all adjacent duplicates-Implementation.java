class Solution{
    String rremove(String s) {
        // code here
        return solve(s,new StringBuilder());
        
    }
    
    String solve(String s,StringBuilder str)
    {
        for(int i=0;i<s.length();i++)
        {
         if(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
         {
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)) //eeeppp
            {
                i++;
            }
         }
        else
        {
            str.append(s.charAt(i));
        }
        
        }
        if(s.equals(str.toString()))
        return s;
        else
        {
            return solve(str.toString(),new StringBuilder());
        }
    }
}
