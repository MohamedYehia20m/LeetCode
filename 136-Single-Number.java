class Solution {
    public int singleNumber(int[] nums) {
        int len = nums.length;
        int output = 0;
        for(int i = 0 ; i < len ;i++)
        {
            output = output ^ nums[i];
        }
    return output; 
    }
}