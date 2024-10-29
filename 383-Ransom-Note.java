class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //character frequency of ransom note
        int arr1 [] = new int [26];
        int flag = 0;
        for (int i = 0 ;i < ransomNote.length() ;i++)
        {
            int let = ransomNote.charAt(i);
            int ascii = let - 'a'; 
            arr1[ascii]++;  
        }
        //character frequency of magazine
        int arr2 [] = new int [26];
        for (int j = 0 ;j < magazine.length() ;j++)
        {
            int let2 = magazine.charAt(j);
            int ascii2 = let2 - 'a'; 
            arr2[ascii2]++;  
        }
        //comparing between both
        for(int k = 0;k < 26 ;k++ )
        {
            if(arr1[k] <= arr2[k])
            flag++;
        }
        if(flag == 26)
        return true;
    return false;
    }
}