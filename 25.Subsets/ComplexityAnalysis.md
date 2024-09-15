# Time Complexity

- **Generating Subsets:** The number of possible subsets is `2^n`, where `n` is the number of elements. Generating all subsets takes `O(2^n)` time.
- **Sorting Subsets:** Sorting requires `O(n * 2^n * log(2^n))`, which simplifies to `O(n * 2^n * n)`.

  Thus, the total time complexity is `O(n * 2^n * log(2^n))`.

# Space Complexity

- **Storing Subsets:** Requires `O(n * 2^n)` space.
- **Recursive Call Stack:** The maximum depth of recursion is `n`, requiring `O(n)` space.

  Therefore, the overall space complexity is `O(n * 2^n)`.
