//import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store (Number -> Index)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // What number do we need?
            
            // 1. Check if we have already seen the complement!
            if (map.containsKey(complement)) {
                // If yes, we found our pair! Return its index and current index.
                return new int[] { map.get(complement), i };
            }
            
            // 2. Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (though problem guarantees one)
        return new int[] {};
    }
}