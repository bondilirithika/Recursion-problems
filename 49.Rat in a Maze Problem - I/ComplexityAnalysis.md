

# Time Complexity
  - The function checks all possible paths in the matrix using backtracking.
  - From each cell, it can move in 4 directions (up, down, left, right).
  - Worst case,the function might explore all n^2 cells.
  - Each cell can lead to multiple paths, resulting in a time complexity of:
  O(4^(n^2))

# Space Complexity
  - The maximum depth of recursive calls can go up to n^2.
  - The visited array size is  n * n , contributing O(n^2)
  - In total:O(n^2)

