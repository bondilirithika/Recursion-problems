# Complexity Analysis

## Time Complexity:

1. **Single Pass of `solve` Function**:
   - The `solve` function iterates over the string in a single pass, processing each character once. This takes **O(n)** time, where **n** is the length of the string.

2. **Number of Recursive Calls**:
   - The function is called recursively until no adjacent duplicates remain.
   - In the **worst case**, only a few characters (e.g., one pair of adjacent duplicates) are removed per recursive call, which could result in **O(n)** recursive calls. Since each recursive call takes **O(n)** time, the overall time complexity in the worst case is:
     \[
     O(n^2)
     \]
   - In the **average case**, the string will be significantly reduced after each call, so the recursion depth will be much smaller. Thus, the **expected time complexity** is:
     \[
     O(n)
     \]

## Space Complexity:

1. **StringBuilder**:
   - Each recursive call creates a new `StringBuilder`, which stores a copy of the string being processed. The space used by the `StringBuilder` is **O(n)**.

2. **Recursion Depth**:
   - The maximum depth of recursion is proportional to the number of recursive calls. In the worst case, the recursion depth could be **O(n)** if only a few characters are removed per call.

Thus, the overall space complexity is:
\[
O(n)
\]

## Summary:

- **Worst-Case Time Complexity**: **O(n²)**.
- **Expected Time Complexity**: **O(n)**.
- **Space Complexity**: **O(n)**.
