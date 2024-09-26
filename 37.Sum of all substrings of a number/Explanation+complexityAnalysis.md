# Sum of All Substrings of a Number

Given an integer `s` represented as a string, the task is to find the sum of all possible substrings of this string. Since the answer can be large, return the result modulo \(10^9 + 7\).

## Key Concept:
Each digit in the string **contributes** to several substrings. Instead of generating all substrings and summing them, we calculate the contribution of each digit directly using dynamic programming.

### Example:
Take the number `s = "123"` as an example.

#### Substrings of `"123"`:
- Substrings formed by `1`: `"1"`
- Substrings formed by `2`: `"2"`, `"12"`
- Substrings formed by `3`: `"3"`, `"23"`, `"123"`

So the sum of all substrings is:
1 + 2 + 3 + 12 + 23 + 123 = 164

Instead of generating each substring, we calculate how much each digit contributes directly using the formula:

\[
sum[i] = (sum[i-1] * 10) + (i+1) * digit at s[i]
\]

Where:
- `sum[i-1] * 10`: This takes all previous contributions and shifts them left by one digit, multiplying by 10.
- `(i+1)*{current digit}`: The new digit at position `i` contributes to all the new substrings formed at this position.

## Step-by-Step Example

For `s = "123"`:

### Step 1: First digit (`"1"`)
- Substrings: `"1"`
- Contribution: `1`
- `sum = 1`

### Step 2: Second digit (`"2"`)
- Substrings: `"2"`, `"12"`
- Contribution of `2`: `2 * 2 = 4` (because `"2"` contributes to two substrings: `"2"` and `"12"`)
- New total: `sum = sum from step 1 * 10 + 4 = 1 * 10 + 4 = 14`

### Step 3: Third digit (`"3"`)
- Substrings: `"3"`, `"23"`, `"123"`
- Contribution of `3`: `3 * 3 = 9` (because `"3"` contributes to three substrings: `"3"`, `"23"`, and `"123"`)
- New total: `sum = sum from step 2 * 10 + 9 = 14 * 10 + 9 = 149`

Thus, the total sum of all substrings for `s = "123"` is `149`.

# COMPLEXITY ANALYSIS

## ITERATIVE WAY
### Time complexity:
- The for loop runs for n times where n is th elength of the string s
- O(n) is the total time complexity
### Space complexity:
- The variables we use take a constant space
- O(1) is teh toatal space complexity

## RECURSIVE WAY
### Time Complexity:
- The recursive function sum runs for n times were n is the length of the string->O(n)
- The function sumSubstrings runs one time for calling the recursive funcion->O(1)
- total->O(n)

### Space complexity:
- Due to the recursive stack that goes to the max depth of O(n),the total space taken is O(n)
- This method gives us a runtime error due to stackoverflow
- Total->O(n)
