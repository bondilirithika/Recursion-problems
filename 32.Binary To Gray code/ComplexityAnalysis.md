
# Iterative Approach

## Time complexity
- **Binary Conversion**: Converting the integer `n` to a binary string takes \( O(log n) \) time.
- **Processing Bits**: The iterative approach processes each bit of the binary string exactly once. Each iteration performs constant work (XOR operation and appending to the result), resulting in a time complexity of \( O(log n) \).
- **String Parsing**: The final step `Integer.parseInt()` also takes \( O(log n) \) time.

**Total Time Complexity (Iterative Approach):**

\[ O(log n) \]

## Space complexity
- **Binary String**: The binary string takes \( O(log n) \) space.
- **Result Storage**: The space for storing the binary result is \( O(log n) \) as well.

**Total Space Complexity (Iterative Approach):**

\[ O(log n) \]

## Recursive Approach

## Time complexity
- **Binary Conversion**: Converting the integer `n` to a binary string takes \( O(log n) \) time.
- **Recursive Function**: The recursive function `solve()` processes each bit of the string exactly once. The depth of the recursion is proportional to the number of bits (\( log n \)). Each recursive call performs constant work (XOR operation and appending to the string), making the time complexity \( O(log n) \).
- **String Parsing**: The final step `Integer.parseInt()` also takes \( O(log n) \) time.

**Total Time Complexity (Recursive Approach):**

\[ O(log n) \]

## Space complexity
- **Binary String**: The binary string `a` takes up \( O(log n) \) space.
- **StringBuilder**: The `StringBuilder` storing the binary result takes \( O(log n) \) space.
- **Recursion Stack**: The recursion depth is proportional to \( log n \), so the recursion stack requires \( O(log n) \) space.

**Total Space Complexity (Recursive Approach):**

\[ O(log n) \]


