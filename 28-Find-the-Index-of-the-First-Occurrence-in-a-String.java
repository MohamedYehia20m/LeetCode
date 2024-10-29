class Solution {
    public int strStr(String haystack, String needle) {
        int haylen = haystack.length();
        int neelen = needle.length();

        if(neelen > haylen)
        return -1;

        for(int i = 0 ;i <= (haylen - neelen) ;i++)
        {
            String a = haystack.substring(i,i+neelen);
            if(a.equals(needle))
            return i;
        }
    return -1;
    }
}