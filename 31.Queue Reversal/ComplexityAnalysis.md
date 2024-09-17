# Complexity Analysis

### Problem:
The function `rev()` reverses a queue using recursion, where the helper function `solve()` processes the reversal recursively.

### 1. Time Complexity:

- The `rev()` function invokes the recursive `solve()` method. For each element in the queue, two operations are performed:
  - **`poll()`** removes the front element from the queue, which takes `O(1)` time.
  - **`add()`** adds the removed element back to the queue after recursion, which also takes `O(1)` time.
  
- Since there are `n` elements in the queue and each element is processed once, the total time complexity is:
  
O(n)


where `n` is the total number of elements in the queue.

### 2. Auxiliary Space:

- The auxiliary space is primarily determined by the recursion stack.
- The recursion goes as deep as the number of elements in the queue, i.e., `n` levels of recursion.
- Therefore, the auxiliary space complexity due to the recursion stack is:

O(n)


### 3. Space Complexity:

- **Queue Space:** The queue `q` holds `n` elements, but this is not considered auxiliary space since it's part of the input/output.
- **Recursion Stack Space:** The recursion stack holds up to `n` function calls, so the space complexity due to recursion is:

  O(n)

  
### 4. Summary:

- **Time Complexity:** `O(n)` (where `n` is the number of elements in the queue).
- **Auxiliary Space Complexity:** `O(n)` (due to the recursion stack).


