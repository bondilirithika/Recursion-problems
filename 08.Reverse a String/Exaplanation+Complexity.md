# EXPLANATION:

TWO-POINTER APPROACH:

![image](https://github.com/user-attachments/assets/61416bcc-f4a6-4841-8d7e-970f5567ca02)

->Here p and q are the two pointers being used.

->When p and q points to the same index(when length is odd) or when p pointer to an index greater than q(when length is even) we return the string,it means that we have traversed the whole string

# Time complexity:

->As we are traversing the string using two pointer from the start and one from the end,the no.of times the function runs becomes halved

->**IN TOTAL**->O(n/2)->O(n)

# Space complexity:

->The variable swe use take up constant space->O(1)

->The recursive function takes O(n/2) due to the recursive stack

->**IN TOTAL**-> O(n/2)->O(n)
