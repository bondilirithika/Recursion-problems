# Knight Walk

Given a square chessboard, the initial position of Knight and position of a target. Find out the minimum steps a Knight will take to reach the target position.If it cannot reach the target position return -1.

**Note**:
The initial and the target position co-ordinates of Knight have been given accoring to 1-base indexing.

## Example 1:

**Input**:
N=6

knightPos[ ] = {4, 5}

targetPos[ ] = {1, 1}

**Output**:
3

**Explanation**:

Knight takes 3 step to reach from

(4, 5) to (1, 1):

(4, 5) -> (5, 3) -> (3, 2) -> (1, 1). 

## Example 2:

**Input**:
N=8

knightPos[ ] = {7, 7}

targetPos[ ] = {1, 5}

**Output**:
4

**Explanation**:
Knight takes 4 steps to reach from
(7, 7) to (1, 5):

(4, 5) -> (6, 5) -> (5, 3) -> (7, 2) -> (1, 5).

# Expected complexities
Expected Time Complexity: O(N^2).

Expected Auxiliary Space: O(N^2).

# Constraints:
1 <= N <= 1000

1 <= Knight_pos(X, Y), Targer_pos(X, Y) <= N

# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/knight-walk4521/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
