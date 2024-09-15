# Time Complexity

- The DFS algorithm processes each node and edge exactly once.
- Therefore, the time complexity is `O(V + E)`, where `V` is the number of vertices and `E` is the number of edges.

# Space Complexity

- The space complexity includes:
  - The `vis` array which takes `O(V)` space.
  - The recursion stack which can go up to a maximum depth of `O(V)`.
  - The result list (`arr`) which takes `O(V)` space.

  Therefore, the overall space complexity is `O(V)`.
