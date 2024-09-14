/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        long min=getmin(arr,Long.MAX_VALUE,0);
        long max=getmax(arr,Long.MIN_VALUE,0);
        return new Pair(min,max);
    }
    
    long getmin(int[] arr,long min,int i)
    {
        if(i>=arr.length)
        return min;
        if(arr[i]<min)
        min=arr[i];
        return getmin(arr,min,i+1);
    }
    
    long getmax(int[] arr,long max,int i)
    {
        if(i>=arr.length)
        return max;
        if(arr[i]>max)
        max=arr[i];
        return getmax(arr,max,i+1);
    }
}
