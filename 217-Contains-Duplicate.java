class Solution {
    public boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        HashMap <Integer , Integer> arr = new HashMap<>();
        for(int i = 0 ;i < len ; i++)
        {
            boolean e = arr.containsKey(nums[i]);
            if(e)
            return true;
            else
            arr.put(nums[i],1);
        }
    return false;
    }
}