class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        String s=Integer.toString(n);
        return palin(s,0,s.length()-1);
    }
    String palin(String s,int i,int j)
    {
        if(i>j || i==j)
        return "Yes";
        if(s.charAt(i)!=s.charAt(j))
        return "No";
        return palin(s,i+1,j-1);
    }
}
