class Solution {
    public int firstUniqChar(String s) {
        int [] alpha = new int [26];
        int len = s.length();
        for(int i = 0 ;i < len ;i++)
        {
            alpha[s.charAt(i) - 'a']++;
        }
        for(int j = 0 ;j < len ;j++)
        {
            if(alpha[s.charAt(j) - 'a'] == 1)
            return j;
        }    
    return -1;
    }
}