class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum(); //sum of an array
        int leftmost = 0;
        int len = nums.length;

        for(int i = 0; i < len; i++) {
            double estimate = (sum - nums[i]) * 0.5;
            //System.out.println(estimate);
            
            if (leftmost == estimate && (estimate%1 == 0))
                return i;
            else
                leftmost += nums[i];

        }

        return -1;
    }
}