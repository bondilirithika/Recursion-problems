# Find all possible paths from top to bottom

Given a N x M grid. Find All possible paths from top left to bottom right.From each cell you can either move only to right or down.

## Example 1:

**Input:**

1 2 3

4 5 6

**Output:**

1 4 5 6

1 2 5 6 

1 2 3 6

**Explanation:** We can see that there are 3 
paths from the cell (0,0) to (1,2).
## Example 2:

**Input:**

1 2

3 4
       
**Output:**

1 2 4

1 3 4

# Expected Complexity

Expected Time Complexity: O(2^N*M)

Expected Auxiliary Space: O(N)


# Constraints:
1 <= n,m <= 10 

1 <= grid[i][j] <= n*m

n * m < 20

# Link
[QUESTION LINK](https://www.geeksforgeeks.org/problems/find-all-possible-paths-from-top-to-bottom/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
