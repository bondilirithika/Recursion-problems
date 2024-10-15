# Longest substring to form a Palindrome

Given a string S which only contains lowercase alphabets. Find the length of the longest substring of S such that the characters in it can be rearranged to form a palindrome.


## Example 1:

Input:
S = "aabe"

Output:
3

Explanation:
The substring "aab" can be rearranged to
"aba" which is the longest palindrome
possible for this String.

## Example 2:
Input:
S = "adbabd"

Output:
6

## Explanation:
The whole string “adbabd” can be
rearranged to form a palindromic substring.
One possible arrangement is "abddba".
Thus, output length of the string is 6. 

## Expected complexities:
Expected Time Complexity: O(|S|*26)

Expected Auxiliary Space: O(|S|*26)


## Constraints:
1 ≤ |S| ≤ 10^5
