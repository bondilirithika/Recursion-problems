

# Time Complexity

- The recursive function `sol` processes each state `(i, tar)` exactly once and stores the result in the `dp` table.
- The total number of states is `N * (sum + 1)`.

  Therefore, the time complexity is `O(N * sum)`.

# Space Complexity

- The `dp` table requires `O(N * sum)` space to store results for each state.
- The recursion stack can go up to a depth of `N`.

  Therefore, the overall space complexity is `O(N * sum)`.
