# Longest Common Subsequence

Given two strings str1 & str 2 of length n & m respectively, return the length of their longest common subsequence. If there is no common subsequence then, return 0. 

A subsequence is a sequence that can be derived from the given string by deleting some or no elements without changing the order of the remaining elements. For example, "abe" is a subsequence of "abcde".

## Example 1:

**Input:** n = 6, str1 = ABCDGH and m = 6, str2 = AEDFHR

**Output:** 3

**Explanation:** LCS for input strings “ABCDGH” and “AEDFHR” is “ADH” of length 3.

## Example 2:

**Input:** n = 3, str1 = ABC and m = 2, str2 = AC

**Output:** 2

**Explanation:** LCS of "ABC" and "AC" is "AC" of length 2.

## Example 3:

**Input:** n = 4, str1 = XYZW and m = 4, str2 = XYWZ

**Output:** 3

**Explanation:** There are two common subsequences of length 3 “XYZ”, and”XYW”, and no common subsequence. of length more than 3.

# Expected Complexity
Expected Time Complexity: O(n*m)

Expected Auxiliary Space: O(n*m)

# Constraints:
1<= n, m <=10^3

str1 and str2 are in uppercase alphabet

# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/longest-common-subsequence-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
