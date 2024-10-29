class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // character frequency for s1 
        int letters [] = new int [26];
        for(int i = 0 ;i < s1.length() ;i++ )
        {
            int let = s1.charAt(i);
            int ascii = let - 97;  // A ascii code is 97 , z ascii code is 122
            letters[ascii]++; 
        }
        //getting substring of s2 same length as s1 and comparing character frequency
        for(int j = 0 ;j <= (s2.length() - s1.length()) ;j++) //sliding window technique
        {
            int flag = 0;
            String sub = s2.substring( j ,j + s1.length());
            //System.out.print("j : " + j);
            //System.out.println(" , sub : " + sub);
            int letters2 [] = new int [26];
            for(int k = 0 ;k < sub.length() ;k++ ) //character frequency for sub
            {
            int let2 = sub.charAt(k);
            int ascii2 = let2 - 97;  // A ascii code is 97 , z ascii code is 122
            letters2[ascii2]++; 
            }
            for (int l = 0 ;l < 26; l++ ) //comparing character frequency
            {
                //System.out.println("character index : " + l);
                //System.out.print("letters : " + letters[l]);  //printing both arrays
                //System.out.println(" , letters2 : " + letters2[l]);
                if(letters[l] == letters2[l])
                flag++;
            }
            //System.out.println("flag : " + flag);
            if (flag == 26)
            return true;  
        }
    return false;
    }
}