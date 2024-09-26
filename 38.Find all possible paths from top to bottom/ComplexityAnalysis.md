## Time Complexity
- The algorithm explores every possible path from the top-left to the bottom-right of the grid.
- In the worst case, it can make up to 2^(n + m) recursive calls, where n is the number of rows and m is the number of columns. 

So, the time complexity is: 

O(2^(n + m)) 


## Space Complexity
- The maximum depth of the recursion (the longest path) is (O(n + m)) due to moving down or right in the grid. 
- Additionally, each valid path stored can also take up to (O(n + m)) space. 

So, the space complexity is: 
 
O(n + m) 
