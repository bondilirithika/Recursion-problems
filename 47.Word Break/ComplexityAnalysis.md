

# Time Complexity
## Without Memoization: 
  - The function explores all possible ways to break the string, leading to potentially exponential growth in calls.
  - **Overall**: O(2^n) (since each character can either be part of a word or not).

## With Memoization:
  - Each unique starting position in the string is computed only once.
  - You also check all possible substrings from each starting position.
  - **Overall**:O(n^2).

# Space Complexity
## Without Memoization:
  - The call stack can go as deep as the length of the string.
  - **Overall**: O(n) (for the call stack).
  
## With Memoization:
  - You also need space to store the results of previous computations.
  - **Overall**: O(n) (for the call stack) + O(n) (for memoization) =O(n)
