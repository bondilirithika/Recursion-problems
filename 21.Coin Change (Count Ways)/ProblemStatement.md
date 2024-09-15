# Coin Change (Count Ways)

Given an integer array coins[ ] of size N representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ].  

**Note:** Assume that you have an infinite supply of each type of coin. And you can use any coin as many times as you want.

# Example 1:

**Input:**
N = 3, sum = 4
coins = {1,2,3}

**Output:** 4

**Explanation**: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.

# Example 2:

**Input:**
N = 4, Sum = 10
coins = {2,5,3,6}

**Output:** 5

**Explanation:** Five Possible ways are: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.

# Expected complexity
Expected Time Complexity: O(sum*N)

Expected Auxiliary Space: O(sum)

# Constraints:
1 <= sum, N, coins[i] <= 10^3

# Link
[QUESTION LINK](https://www.geeksforgeeks.org/problems/coin-change2448/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)
