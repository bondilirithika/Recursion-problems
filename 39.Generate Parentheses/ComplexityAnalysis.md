## Complexity Analysis

### Time Complexity
- The algorithm generates all combinations of valid parentheses through recursive calls. 
- Each time you add an open or a close parenthesis, it can lead to multiple combinations.
- The number of valid combinations grows exponentially as N increases.
- **Time Complexity**: O(2^N) due to the number of combinations being explored.


### Space Complexity
- The maximum depth of recursion can reach 2N when constructing the parentheses.
- Additionally, space is needed to store all the valid combinations generated.  
- **Space Complexity**: O(N) for recursion depth + (O(number of valid combinations)) for storing the results.
