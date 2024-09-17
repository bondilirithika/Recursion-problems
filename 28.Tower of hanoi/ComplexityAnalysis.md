


# Tower of Hanoi - Complexity Analysis
![](https://upload.wikimedia.org/wikipedia/commons/6/60/Tower_of_Hanoi_4.gif)
### 1. Recursive Formula:

The Tower of Hanoi problem involves moving `n` disks from one rod to another with the help of an auxiliary rod. The recurrence relation for the number of moves required is:

\[
T(n) = 2T(n-1) + 1
\]

Where:
- \( T(n) \) is the number of moves required for `n` disks.
- \( T(n-1) \) is the number of moves required to move `n-1` disks.
- The `+1` accounts for the move of the largest disk (disk `n`).

### 2. Solving the Recurrence Relation:

The recurrence relation \( T(n) = 2T(n-1) + 1 \) can be expanded as follows:

T(n) = 2T(n-1) + 1

T(n) = 2(2T(n-2) + 1) + 1 = 4T(n-2) + 2 + 1

T(n) = 8T(n-3) + 4 + 2 + 1

...

T(n) = 2^k T(n-k) + (2^(k-1) + 2^(k-2) + ... + 2^0)

Eventually, when k = n, T(n-n) = T(0) = 0, so we get:

T(n) = 2^n - 1

Thus, the total number of moves required for n disks is:

T(n) = 2^n - 1

### 3. Time Complexity:

The time complexity of the Tower of Hanoi problem is dominated by the number of moves required, which is exponential. Therefore, the time complexity is:

\[
O(2^n)
\]

This is because:
- At each recursive step, the function solves the problem for `n-1` disks twice (once for moving to the auxiliary rod and once for moving to the destination rod), and each such step doubles the work compared to the previous one.

### 4. Space Complexity:

The space complexity is determined by the depth of the recursion. Since the recursive calls are nested, the maximum depth of the recursion is `n` (i.e., the height of the recursion tree).

Thus, the space complexity is:

\[
O(n)
\]

This is because:
- The recursion stack holds one frame for each disk being moved, resulting in `n` recursive calls for `n` disks.

### Summary:
- **Time Complexity**: \( O(2^n) \)
- **Space Complexity**: \( O(n) \)
