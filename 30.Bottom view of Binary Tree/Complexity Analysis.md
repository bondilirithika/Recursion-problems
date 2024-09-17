## Complexity Analysis: Iterative vs Recursive Approach

### Iterative Approach

#### Time Complexity

1. **Traversal of Nodes:**
   - Each node in the tree is processed once, which takes `O(n)` time, where `n` is the total number of nodes.

2. **Updating the HashMap:**
   - For every node, we update the HashMap, which takes `O(1)` on average for each node. Thus, for `n` nodes, the overall cost is `O(n)`.

3. **Sorting the Keys:**
   - After traversing the tree, we sort the keys (horizontal distances) from the HashMap. Sorting `m` keys, where `m` is the number of distinct horizontal distances, takes `O(m log m)`. In the worst case, `m = O(n)` when each node has a distinct horizontal distance.

   **Overall Time Complexity:**  
   The sorting step dominates, so the time complexity is:  
   `O(n log n)`

#### Space Complexity

1. **Queue:**
   - In the worst case, the queue can hold `O(n)` nodes, which happens in an unbalanced tree. For balanced trees, the queue's size is proportional to the width of the tree.

2. **HashMap:**
   - The HashMap stores up to `n` entries, one for each horizontal distance.

3. **Result Array:**
   - The result array also stores up to `n` values in the worst case.

   **Overall Space Complexity:**  
   \[
   O(n)
   \]

---

### Recursive Approach

#### Time Complexity

1. **Recursive Tree Traversal:**
   - Each node in the tree is visited once, which takes `O(n)` time.

2. **Updating the HashMap:**
   - Like the iterative approach, updating the HashMap takes `O(1)` on average for each node, so the overall cost is `O(n)`.

3. **Sorting the Keys:**
   - After recursion, we sort the keys (horizontal distances) in `O(n log n)` time.

   **Overall Time Complexity:**  
   Similar to the iterative approach, the time complexity is:  
  `O(n log n)`

#### Space Complexity

1. **Recursive Call Stack:**
   - The depth of the recursive call stack is proportional to the height of the tree. In a balanced tree, the height is `O(log n)`, while in a skewed tree, the height can be as large as `O(n)`.

2. **HashMap:**
   - The HashMap can store up to `n` entries, similar to the iterative approach.

3. **Result Array:**
   - The result array can hold up to `n` values.

   **Overall Space Complexity:**  
   \[
   O(n + h)
   \]
   where `h` is the height of the tree. For a balanced tree, `h = O(log n)`, and for a skewed tree, `h = O(n)`.

---

