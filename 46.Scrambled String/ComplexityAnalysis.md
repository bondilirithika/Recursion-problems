
# Time Complexity
-  The algorithm explores different ways to split two strings.
-  For strings of length n, it can create about n^2 unique pairs of substrings.
-  It remembers results in a HashMap, which prevents redundant calculations.
-  Total time complexity is O(n^2)

# Space Complexity
-  The HashMap can store results for up to n^2 substring pairs.
-  The maximum depth of recursion can go up to n, but this is smaller compared to the HashMap.
- Total space complexity is also O(n^2)
