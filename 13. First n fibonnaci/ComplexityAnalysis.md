# WITHOUT MEMOIZATION:

# TIME COMPLEXITY:
- The recursive tree for n=5 looks like:
```
                     fibonacci(5)
                    /            \
          fibonacci(4)            fibonacci(3)
         /         \              /         \
   fibonacci(3)   fibonacci(2)   fibonacci(2)   fibonacci(1)
   /     \        /     \         /    \
fibonacci(2) fibonacci(1) fibonacci(1) fibonacci(0)
 /    \
fibonacci(1) fibonacci(0)
```
- The for loop in the printFibb function is called for n times->O(n)
- Foe each value of n,the function fib is called 2 times->fib(n-1) and fib(n-2)
- Now each of these calls,will call fib two more times each.So, the number of times the function is called is exponential
- So,the fib function is called 2^n times->O(2^n)
- IN TOTAL:O(n)+O(2^n)=O(2^n)

# SPACE COMPLEXITY:
- The variables we use are of constant space->O(1)
- The recursive function fib takes O(2^n) as its space complexity due to its recursive stack
- IN TOTAL:O(2^n)


# WITH MEMOIZATION:

# Time complexity:
- The recursive tree looks like:
``` 
                     fibonacci(5)
                    /            \
          fibonacci(4)            (memoized fibonacci(3))
         /         \
   fibonacci(3)   (memoized fibonacci(2))
   /     \
(memoized fibonacci(2)) (memoized fibonacci(1))
```
- Each Fibonacci number is calculated only once, and the results are stored (memoized) for later use, preventing redundant calculations.
- So,The no.of times the function is called is n times->O(n)
- IN TOTAL:O(n)

# Space complexity
- Due to the recursion stack,space complexity=O(n)








