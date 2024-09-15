class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        return solve(arr,k,0,arr.length-1);
    }
    
    int solve(int[] arr,int k,int low,int high)
    {
        if(low>high)
        return -1;
        int mid=(low+high)/2;
        if(arr[mid]==k)
        return mid;;
        if(k>arr[mid])
            return solve(arr,k,mid+1,high);
        
        return solve(arr,k,low,mid-1);
    }
}
