# Explanation:
![image](https://github.com/user-attachments/assets/a8d92c1f-1d7a-47fe-848f-51d1391fb616)

from the above image,we can see that the powers of 2 are increasing from the last index ie., from 0->str.length()-1

Hence the Math.pow(str.length()-1-i);

# Complexiy analysis:

# Time complexity:
The recursive function will have maximum stack depth of O(str.length()) as it runs for str.length() times->O(n)

**IN TOTAL**:O(n)

# Space complexity:

The variables which we are using takes constant time,so->O(1)

But the recursive function will take O(n) due to its stack depth

**Total->**O(n)
