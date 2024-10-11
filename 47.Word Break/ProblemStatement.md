# Word Break

Given a string s and a dictionary of n words dictionary, find out if "s" can be segmented into a space-separated sequence of dictionary words.

Return 1 if it is possible to break the s into a sequence of dictionary words, else return 0. 

Note: From the dictionary dictionary each word can be taken any number of times and in any order.

## Examples :

**Input:** n = 6, s = "ilike", dictionary = { "i", "like", "sam", "sung", "samsung", "mobile"}

**Output**: 1

**Explanation:** The string can be segmented as "i like".

**Input**: n = 6, s = "ilikesamsung", dictionary = { "i", "like", "sam", "sung", "samsung", "mobile"}

**Output**: 1

**Explanation:** The string can be segmented as "i like samsung" or "i like sam sung".

# Expected complexities
Expected Time Complexity: O(len(s)^2)

Expected Space Complexity: O(len(s))

# Constraints:
1 ≤ n ≤ 12

1 ≤ len(s) ≤ 1100

# LINK
[QUESTION LINK](https://www.geeksforgeeks.org/problems/word-break1352/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
