class Solution {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        solve(a,ans,new ArrayList<Integer>(),0);
        Collections.sort(ans, (list1, list2) -> {
            int size1 = list1.size();
            int size2 = list2.size();
            for (int i = 0; i < Math.min(size1, size2); i++) {
                int cmp = Integer.compare(list1.get(i), list2.get(i));
                if (cmp != 0) {
                    return cmp;
                }
            }
            return Integer.compare(size1, size2);
        });
        return ans;
    }
    
    static void solve(ArrayList<Integer> a,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> now,int ind)
    {
        ans.add(new ArrayList<Integer>(now));
        
        for(int i=ind;i<a.size();i++)
        {
            now.add(a.get(i));
            solve(a,ans,now,i+1);
            now.remove(now.size()-1);
            //solve(a,ans,now,vis,i+1);
        }
    }
}
