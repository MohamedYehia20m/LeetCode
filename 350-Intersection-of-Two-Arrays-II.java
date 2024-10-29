class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> inter = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2)
        {
            if(nums1[i] > nums2[j])
            {
                j++;
            }
            else if(nums1[i] < nums2[j])
            {
                i++;
            }
            else
            {
                inter.add(nums1[i]);
                i++;
                j++;
            }
        }
        int ss = inter.size();
        int [] op = new int [ss];
        for(int k = 0 ;k < ss ;k++)
        {
            op[k] = inter.get(k);
        }
    return op;
    }
}