# Solve the Sudoku

Given an incomplete Sudoku configuration in terms of a 9 x 9  2-D square matrix (grid[][]), the task is to find a solved Sudoku. For simplicity, you may assume that there will be only one unique solution.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.

Each of the digits 1-9 must occur exactly once in each column.

Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

Zeros in the grid indicates blanks, which are to be filled with some number between 1-9. You can not replace the element in the cell which is not blank.


Sample Sudoku for you to get the logic for its solution:

![image](https://github.com/user-attachments/assets/9f73f87b-06ed-49e9-a83f-dccb1ef4d3cc)


## Example 1:

**Input**:
grid[][] = 
```
[[3 0 6 5 0 8 4 0 0],
[5 2 0 0 0 0 0 0 0],
[0 8 7 0 0 0 0 3 1 ],
[0 0 3 0 1 0 0 8 0],
[9 0 0 8 6 3 0 0 5],
[0 5 0 0 9 0 6 0 0],
[1 3 0 0 0 0 2 5 0],
[0 0 0 0 0 0 0 7 4],
[0 0 5 2 0 6 3 0 0]]
```
**Output**:
True
```
3 1 6 5 7 8 4 9 2
5 2 9 1 3 4 7 6 8
4 8 7 6 2 9 5 3 1
2 6 3 4 1 5 9 8 7
9 7 4 8 6 3 1 2 5
8 5 1 7 9 2 6 4 3
1 3 8 9 4 7 2 5 6
6 9 2 3 5 1 8 7 4
7 4 5 2 8 6 3 1 9
```
**Explanation**: 
There exists a valid Sudoku for the input grid, which is shown in output.

## Example 2:

**Input**:
grid[][] = 
```
[[3 6 6 5 0 8 4 0 0],
[5 2 0 0 0 0 0 0 0],
[0 8 7 0 0 0 0 3 1 ],
[0 0 3 0 1 0 0 8 0],
[9 0 0 8 6 3 0 0 5],
[0 5 0 0 9 0 6 0 0],
[1 3 0 0 0 0 2 5 0],
[0 0 0 0 0 0 0 7 4],
[0 0 5 2 0 6 3 0 0]]
```
**Output**:
False

**Explanation**: 
There does not exists a valid Sudoku for the input grid, since there are two 6s in the first row. Which cannot replaced.

# Expected Complexities:
Expected Time Complexity: O(9N*N).

Expected Auxiliary Space: O(N*N).

# Constraints:
0 ≤ grid[i][j] ≤ 9

# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/solve-the-sudoku-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
