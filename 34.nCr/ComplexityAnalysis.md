
## Code Overview

The `nCr` method calculates the binomial coefficient \( C(n, r) \), which represents the number of ways to choose `r` elements from `n` elements. The method uses dynamic programming to efficiently compute combinations with memoization.

# Time Complexity

- **Initialization**: The `dp` table is a 2D array of size `(n + 1) x (r + 1)`. Initializing this table takes `O(n * r)` time.
- **Recursive Computation**: The `solve` method is called recursively, but due to memoization, each unique state `(n, r)` is computed only once. There are at most `(n + 1) x (r + 1)` states, and each state computation is done in constant time `O(1)`.

**Total Time Complexity**: 

`O(n * r)`

# Space Complexity

- **DP Table**: The space required for the `dp` table is `O(n * r)`.
- **Recursive Stack**: The depth of the recursion stack is at most `n`, which takes `O(n)` space.

**Total Space Complexity**: 

`O(n * r)`



where `n` is the total number of elements, and `r` is the number of elements to choose.
