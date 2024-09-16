# Recursively remove all adjacent duplicates

Given a string s, remove all its adjacent duplicate characters recursively. 

**Note:** For some test cases, the resultant string would be an empty string. In that case, the function should return the empty string only.

# Example 1:

**Input:**
S = "geeksforgeek"

**Output:** "gksforgk"

**Explanation:** 
g(ee)ksforg(ee)k -> gksforgk

# Example 2:

**Input:** 
S = "abccbccba"

**Output:** ""

**Explanation:** 
ab(cc)b(cc)ba->abbba->a(bbb)a->aa->(aa)->""(empty string)

# Expected Complexity:
Expected Time Complexity: O(|S|)

Expected Auxiliary Space: O(|S|)


# Constraints:
1<=|S|<=10^5

# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/recursively-remove-all-adjacent-duplicates0744/1?)
