# Explanation:
->Needed last word,so starting the index from s.length()-1

->If the character at the last index has ' ' before the alphabets start then we ignore the space characters

->If while traversing we have found some alphabets and then we find the ' ' then that's where our last word ends and we return the length

->As we are decrementing the index,if the index becomes less tahn 0 ie., invalid then also we return whatever the count is.

# Time complexity:

->The recursive function runs length of the last word no.of times.

->In worst case,the length can be n so,it can run for n times max.

->**IN TOTAL**->O(N)

# Space complexity:

->The variables we use take constant space->O(1)

->The recursion stack takes O(N) due to the recursive depth.

->**IN TOTAL:** O(N)
