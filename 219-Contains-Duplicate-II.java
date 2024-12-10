class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int x = 0; //leftmost pointer
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            if(!set.add(nums[i])) // duplicate found
                return true;
            if(set.size() > k )
                set.remove(nums[x++]);
        }
        return false;
    }
}