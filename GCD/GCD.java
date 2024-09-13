class Solution {
    public static int gcd(int a, int b) {
        // code here
      //EUCLIDS ALGORITHM
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}
