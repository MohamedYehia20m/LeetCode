class Solution {
    public void swap (int[] arr , int x , int [] arr2 , int y )
    {
        int temp = arr[x];
        arr[x] = arr2[y];
        arr2[y] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0)
        {
            nums1[0] = nums2[0];
        }
        int arr = 0;
        int arr2 = 0;
        if(n!=0)
        {
            for(int i = 0 ; i < m ;i++)
            {
                if(nums1[arr] > nums2[arr2]) //comparing the 2 arrays
                {
                    System.out.println("nums1[arr1] : " + nums1[arr]);
                    System.out.println("nums2[arr2] : " + nums2[arr2]);    
                    swap(nums1 , arr , nums2 , arr2) ; //to be written
                    if(arr2 + 1 < n)
                    if(nums2[arr2] > nums2[arr2 + 1])
                    Arrays.sort(nums2);
                    arr++;
                }
                else
                {
                    arr++;
                }
                System.out.println("i : " + i);
                System.out.println("nums1[i] : " + nums1[i]);
            }
            
            for(int j = m ;j < (m+n) ;j++) //assign the remainder to nums1
            {
                nums1[j] = nums2[arr2];
                arr2++;
                System.out.println("j : " + j);
                System.out.println("nums1[j] : " + nums1[j]);
            }
        }
    }
}