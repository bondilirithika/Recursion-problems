# N-Queen Problem

The n-queens puzzle is the problem of placing n queens on a (n×n) chessboard such that no two queens can attack each other.
Given an integer n, find all distinct solutions to the n-queens puzzle. Each solution contains distinct board configurations of the n-queens placement, where the solutions are a permutation of [1,2,3..n] in increasing order, here the number in the ith place denotes that the ith-column queen is placed in the row with that number. For eg below figure represents a chessboard [3 1 4 2].

## Examples:

**Input**: 1

**Output:** [1]

**Explaination:** Only one queen can be placed in the single cell available.

**Input:** 4

**Output:** [[2 4 1 3 ],[3 1 4 2 ]]

**Explaination:** These are the 2 possible solutions.

# Expected complexity:
Expected Time Complexity: O(n!)

Expected Auxiliary Space: O(n^2) 

# Constraints:
1 ≤ n ≤ 10

# Link
[Question link](https://www.geeksforgeeks.org/problems/n-queen-problem0315/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
