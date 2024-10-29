class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int insertindex = 1;
        for(int j = 0 ;j < len - 1 ;j++)
        {
            if(nums[j] < nums[j + 1])
            {
                nums[insertindex] = nums[j+1];
                insertindex++;
            }
        }
        return insertindex;
    }
}