
class Solution {
    public static int longestSubstring(String s) {
        int n = s.length();
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int bitmask = 0; // To keep track of the frequency of characters
        map.put(bitmask, -1); // To handle the case where the entire substring is valid from the start
        
        for (int i = 0; i < n; ++i) {
            // Update the bitmask for the current character
            int charBit = s.charAt(i) - 'a';
            bitmask ^= (1 << charBit);
            
            // Check if the current bitmask has been seen before
            if (map.containsKey(bitmask)) {
                ans = Math.max(ans, i - map.get(bitmask));
            } else {
                map.put(bitmask, i);
            }
            
            // Check if changing one bit results in a previously seen bitmask
            for (int j = 0; j < 26; ++j) {
                int modifiedBitmask = bitmask ^ (1 << j);
                if (map.containsKey(modifiedBitmask)) {
                    ans = Math.max(ans, i - map.get(modifiedBitmask));
                }
            }
        }
        
        return ans;
    }
