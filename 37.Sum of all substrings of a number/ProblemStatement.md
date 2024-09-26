# Sum of all substrings of a number

Given an integer s represented as a string, the task is to get the sum of all possible sub-strings of this string.
As the answer will be large, return answer modulo 10^9+7. 

**Note:** The number may have leading zeros.

## Example 1:

**Input:**
s = "1234"

**Output:** 
1670

**Explanation:** 
Sum = 1 + 2 + 3 + 4 + 12 + 23 + 34 + 123 + 234 + 1234 = 1670
## Example 2:

**Input:**
s = "421"

**Output:** 
491
**Explanation:** 
Sum = 4 + 2 + 1 + 42 + 21 + 421 = 491
# Expected complexity:
Expected Time Complexity: O(|s|).

Expected Auxiliary Space: O(|s|).

# Constraints:
1 <= |s| <= 10^5

# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/sum-of-all-substrings-of-a-number-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
