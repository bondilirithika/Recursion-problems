class Solution {

  //FORMULA FOR SUM OF N TERMS IN GP: a((r^n)-1)/r-1
    //here a=1,r=2,n=2^N
    //no need to woory about the denominator as its 2-1:1
  
    // Function to calculate (base^exp) % mod
   public static long modExp(long base, long exp, long mod) {
        // Base case
        if (exp == 0) {
            return 1;
        }
        // Recursive call
        long half = modExp(base, exp / 2, mod);
        long result = (half * half) % mod;  // Square the result
        
        // If exp is odd, multiply by base once more
        if (exp % 2 == 1) {
            result = (result * base) % mod;
        }
        
        return result;
    }

    // Function to compute the sum of the geometric progression
    public static long geoProg(long N) {
        long mod = 1000000007;
        long exp = modExp(2, N, mod - 1);  // Calculate 2^N % (mod-1) ->MOD-1 DUE TO FERMATS LITTLE THEOREM(EXPLAINED IN COMPLEXITY ANALYSIS)
        long sum = modExp(2, exp, mod) - 1;  // Calculate 2^exp % mod and subtract 1
        return sum;
    }
    };
