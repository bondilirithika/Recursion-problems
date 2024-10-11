# Time Complexity:
- The function tries every possible partition of the string, which results in 2^n possible partitions.
- For each partition, it checks if a substring is a palindrome, which takes (O(n)) in the worst case.
- So, total time complexity is O(n*2^n).

### Space Complexity:
- The recursion depth is O(n), as it can go up to the length of the string.
- The final result stores up to O(2^n) partitions, each holding up to O(n) strings.
- So, the space complexity is O(n*2^n).
