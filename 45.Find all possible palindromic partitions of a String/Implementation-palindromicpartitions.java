class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String s) {
        // code here
        //here we are trying to partition at every index
        //if the characters present before the partition are palindrom we continue else we dont
        //as we are looking to partition at every index so we wil be using a for loop
        ArrayList<ArrayList<String>> ans=new ArrayList<ArrayList<String>>();
        ArrayList<String> temp=new ArrayList<String>();
        solve(s,0,temp,ans);
        return ans;
    }
    
    static void solve(String s,int index,ArrayList<String> temp,ArrayList<ArrayList<String>> ans)
    {
        if(index>=s.length())
        {
            
            ans.add(new ArrayList<String>(temp));
            return;
        }
        
        for(int i=index;i<s.length();i++)
        {
            if(ispalindrome(s.substring(index,i+1)))
            {
                temp.add(s.substring(index,i+1));
                solve(s,i+1,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    static boolean ispalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else 
            return false;
        }
        return true;
    }
};
