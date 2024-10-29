class Solution {
    public int[] runningSum(int[] nums) {
        int [] sums = new int [nums.length];
        int sum = nums[0];
        sums[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sums[i] = nums[i] + sums[i-1];
        }
    return sums;
    }
}