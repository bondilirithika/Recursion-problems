# Explanation
![Screenshot 2024-09-15 105202](https://github.com/user-attachments/assets/1acd2212-c4a1-4b79-bc32-cb024b50039e)

# BRUTE FORCE:
# Time complexity
- The loop in the countSetBits function runs for n times
- Converting integer to its binary string takes logn time->as the length of the binary string is proportional to logn,as its inside the loop total->O(nlogn)
- The recursive function runs for logi times->O(log i)
- TOTAL:O(nlogn)

# Space complexity
- The recursive function takes O(logn) as its space complexity ue to the depth of the recursive stack

# Optimal:
# Time complexity
- largest power of 2:The number of iterations of this loop is proportional to the number of bits required to represent n, which is log n base 2. Hence, the time complexity of this function is O(logn).
- Recursive function-Each recursive call reduces the problem size by approximately half, as n is reduced by the largest power of 2 herefore, the number of recursive calls is proportional to logn, since the size of the problem is halved in each step.
- Total->O(logn)*O(logn)=O((logn)^2)

# Space complexity
- the maximum depth of the recursion tree is 
O(logn), which means that the space complexity due to the call stack is 
O(logn).
  
