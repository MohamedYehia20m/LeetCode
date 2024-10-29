class Solution {
    public int[] shuffle(int[] nums, int n) {
        int num2 [] = new int [2*n];
        for(int i = 0;i < n ;i++ )
        {
            num2[2*i] = nums[i]; // even indices
            num2[2*i + 1] = nums[i+n];//odd indices
        }
    return num2;
    }
}