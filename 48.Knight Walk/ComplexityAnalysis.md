![image](https://github.com/user-attachments/assets/9d8e5a4a-4988-4e7b-9c12-156e8996b6a7)

# Time Complexity
- We are using **BFS (Breadth-First Search)** to explore the knight's possible moves.
- The knight can move to **8 possible positions** from each square.
- In the worst case, the knight might need to check all squares on the chessboard(N*N).
- TOTAL: O(N^2)-for visiting each square.

# Space Complexity
- The function uses a queue to hold positions during BFS, which can store up to O(N^2) positions.
- It also uses a **visited** array of size N * N  to track visited squares.
- TOTAL:O(N^2)-for the queue and the visited array.
