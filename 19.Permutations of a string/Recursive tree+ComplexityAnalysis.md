# RECURSIVE TREE
![Screenshot 2024-09-15 222606](https://github.com/user-attachments/assets/0af59f9d-fd97-4baf-98b8-a08e2b9dc949)
# Time complexity:
### Time Complexity

1. **Generating Permutations:**
   - The recursive function generates all possible permutations of the input string. For a string of length `n`, there are `n!` possible permutations.

2. **HashSet Operations:**
   - Adding a string to the `HashSet` has an average time complexity of `O(1)` due to hashing. Thus, adding all permutations to the `HashSet` takes `O(n!)` time.

3. **Sorting:**
   - Sorting the `ArrayList` created from the `HashSet` has a time complexity of `O(n! * log(n!))`.

   Therefore, the overall time complexity is:`O(n!) + O(n! * log(n!)) = O(n! * log(n!))`


### Space Complexity

1. **Space for Permutations:**
- The `HashSet` stores up to `n!` permutations, each of length `n`. Therefore, the space required for storing all permutations is `O(n * n!)`.

2. **Recursive Call Stack:**
- The recursion depth is up to `n`, and each call uses constant space. Thus, the space for the call stack is `O(n)`.

3. **Additional Space:**
- The `vis` array takes `O(n)` space. The temporary string `s` in each recursive call has a length up to `n`, but it is reused.

Thus, the overall space complexity is:`O(n * n!) + O(n) = O(n * n!)`



