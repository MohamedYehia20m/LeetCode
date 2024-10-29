class Solution {
    public void swap(char[] a ,int x , int y) {
        char temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public void reverseString(char[] s) {
        int len = s.length;
        for(int i = 0 ;i < (len / 2);i++)
        {
            swap( s , i , (len -1) - i);
        }
    }
}