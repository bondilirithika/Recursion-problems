class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n=str.length();
        char[] s=str.toCharArray();
        rev(s,0,n-1);
        String ans=new String(s);
        return ans;
    }
    
    public static void rev(char[] s,int p,int q) 
    {
        if(p==q || p>q)
        return;
        char temp=s[p];
        s[p]=s[q];
        s[q]=temp;
        rev(s,p+1,q-1);
    }
}
