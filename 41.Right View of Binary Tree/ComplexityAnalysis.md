# Complexity Analysis
## ITERATIVE WAY
#### Time Complexity
- The algorithm visits every node in the tree exactly once.
- If there are N nodes, it takes O(N) time to process all of them.
- **Time Complexity**:  O(N)

#### Space Complexity
- The algorithm uses a queue to keep track of nodes, which can grow up to the number of nodes in the worst case
- The extra space for storing nodes in a HashMap is also proportional to the number of nodes.
- **Space Complexity**: O(N)

## RECURSIVE WAY
#### Time Complexity
- The algorithm visits every node in the binary tree once.
- Each visit takes constant time.
- **Time Complexity**: O(N), where  N is the number of nodes.

#### Space Complexity
- The recursion stack can go as deep as the height of the tree.
- In the worst case (skewed tree), this is O(N)
- The list storing the right view values also takes up to O(H) space.
- **Space Complexity**: O(H) for the recursion stack, where H  is the height of the tree.

