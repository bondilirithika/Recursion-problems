class Solution 
{ 
    int findLength(String s) 
    { 
        // code here
        return solve(s,s.length()-1,0);
    }
    
    int solve(String s,int i,int count)
    {
        if(i<0|| (s.charAt(i)==' ' && count!=0))
        return count;
        if(s.charAt(i)!=' ')
        count++;
        return solve(s,i-1,count);
    }
}
