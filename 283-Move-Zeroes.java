class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int [] nu = new int [len];
        int counter = 0;
        for(int i = 0 ; i < len ; i++)
        {
            if(nums[i] != 0)
            {
                nu[counter] = nums[i];
                counter++;
            }
        }
        for(int j = counter ;j < len ;j++)
        {
            nu[j] = 0;
        }
        for(int k = 0 ; k < len ; k++)
        {
           nums[k] = nu[k];
        }
    }
}