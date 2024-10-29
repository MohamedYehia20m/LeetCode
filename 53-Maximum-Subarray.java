class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maximum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            //System.out.println("sum : " + sum);
            maximum=Math.max(sum,maximum);
            //System.out.println("maximum : " + maximum);
            if(sum<0) //removing useless section
                sum=0;
        }
        return maximum;
    }
}