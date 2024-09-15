
# Time Complexity

- The algorithm requires a traversal to count the nodes (`O(n)`).
- Another traversal to find the middle node (`O(n/2)`).
- Therefore, the overall time complexity is `O(n)`.

# Space Complexity

- The recursion depth can go up to `O(n/2)`, so the space complexity due to the recursion stack is `O(n)`.
- Additional space for variables is `O(1)`.
- Therefore,overall space complexity is`O(n)`
