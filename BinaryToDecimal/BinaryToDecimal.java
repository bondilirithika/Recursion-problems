class Solution {
    public int binary_to_decimal(String str) {
        // Code here
        return solve(str,str.length()-1,0); //starting from the last index
    }
    
    int solve(String str,int i,int res)
    {
        if(i<0)
        return res;
        if(str.charAt(i)=='1')
        res+=Math.pow(2,str.length()-1-i); 
        return solve(str,i-1,res);
    }
}
