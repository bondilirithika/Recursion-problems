# Time Complexity

   - The algorithm uses backtracking to fill the Sudoku grid.
   - It iterates through all cells (81 in total for a 9x9 grid).
   - For each empty cell (denoted by 0), the algorithm tries placing digits 1 through 9.
   - In the worst case, every cell could potentially be empty, and for each cell, it might check all 9 possible values.
   - This leads to a time complexity of: O(9^{m})--O(9^{n^2})
   where m is the number of empty cells. In a completely empty grid, m can be 81, thus:
   O(9^{81})
# Space Complexity
   - The maximum depth of the recursion can go up to 81 (in the case of filling all cells), so it contributes O(m), where m  is the number of empty cells.
   - The grid itself requires O(1) space since it is a fixed size (9x9).
   - Thus, the total space complexity is:O(m)--O(n^2)
