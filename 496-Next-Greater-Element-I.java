class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] ans = new int[len1];

        for(int i = 0; i < len1; i++) {
            int flag = 0; 
            int curr = 0; //any value
            
            for(int j = 0; j < len2; j++) {
                if (nums1[i] == nums2[j] && (flag == 0)) {
                    curr = j; //rev
                    flag = 1;
                }

                if (( nums2[j] > nums2[curr] ) && (flag == 1)) {
                    ans[i] = nums2[j];
                    break;
                }
                
            }

            if (ans[i] == 0) 
                ans[i] = -1;
        }
        return ans;

    }
}