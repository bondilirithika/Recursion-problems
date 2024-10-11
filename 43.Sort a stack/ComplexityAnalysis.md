# Time Complexity:

- The solve() function removes all elements from the stack and then calls sort() to put them back in the correct order.
- For each element, sort() may need to pop and push elements back into the stack, which can take up to O(n) operations for each element.
- Since this happens for all n elements, the total time complexity is O(n^2).
# Space Complexity:

- The recursion depth can go up to n calls because each function call is stored in the stack until the sorting completes.
- So, the space complexity is O(n).
