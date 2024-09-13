class Solution {
    int sum(int arr[]) {
        // code here
        return solve(arr,0,0);
    }
    
    int solve(int[] arr,int i,int res)
    {
        if(i>=arr.length)//base condition
        return res;
        res+=arr[i];//adding every element
        return solve(arr,i+1,res);
    }
}
