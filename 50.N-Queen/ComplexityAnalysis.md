# Time Complexity

   - At each column, the function checks all rows to find a valid position for a queen.
   - For an n*n chessboard, there are n columns, and in each column, the function checks n rows.
   - This results in a time complexity of O(n!). The reason is that there are n choices for the first queen, n-1 for the second, and so on, leading to factorial growth as you place each queen.

# Space Complexity
   - The maximum depth of the recursion will be n (the height of the call stack when all queens are placed).
   - The `ans` array stores all valid solutions, which can also take up to O(n!) space in the worst case, since each valid arrangement is stored.
   - The chessboard (`chess` array) has a space complexity of O(n^2).
   - The total space complexity:O(n!)
