# DFS of Graph

You are given a connected undirected graph. Perform a Depth First Traversal of the graph.

**Note:** Use the recursive approach to find the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph.


# Example 1:

**Input:** V = 5 , adj = [[2,3,1] , [0], [0,4], [0], [2]]
![image](https://github.com/user-attachments/assets/cc4f210d-0cc0-4c3d-98a8-ef6eec17e108)

**Output:** 0 2 4 3 1

**Explanation:** 
0 is connected to 2, 3, 1.

1 is connected to 0.

2 is connected to 0 and 4.

3 is connected to 0.

4 is connected to 2.

so starting from 0, it will go to 2 then 4,
and then 3 and 1.

Thus dfs will be 0 2 4 3 1.
# Example 2:

**Input:** V = 4, adj = [[1,3], [2,0], [1], [0]]
![image](https://github.com/user-attachments/assets/e2910328-0798-463b-be11-7fab93750fd4)

**Output:** 0 1 2 3

**Explanation:**
0 is connected to 1 , 3.

1 is connected to 0, 2. 

2 is connected to 1.

3 is connected to 0. 

so starting from 0, it will go to 1 then 2
then back to 0 then 0 to 3

thus dfs will be 0 1 2 3. 

# Expected complexity
Expected Time Complexity: O(V + E)

Expected Auxiliary Space: O(V)


# Constraints:
1 ≤ V, E ≤ 10^4
# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
