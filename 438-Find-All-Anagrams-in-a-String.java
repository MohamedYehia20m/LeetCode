class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    // define character frequency of p
    List<Integer> output = new ArrayList<Integer>();
    int letters [] = new int [26];
    char [] chararray = p.toCharArray(); 
    for(int i = 0 ; i < p.length() ;i++)
    {
        //System.out.println("chararray : " + chararray[i]);
        int ascii = chararray[i] - 'a';
        letters[ascii]++;
    }
    //taking a substring of s and define the character frequency of it
    for(int i = 0 ;i <= (s.length() - p.length()) ;i++)
    {
        int flag = 0;
        String sub = s.substring(i ,i + p.length());
        int letters2 [] = new int [26]; //define the character frequency of sub
        char[] chararray2 = sub.toCharArray();
        for(int k = 0 ; k < sub.length() ;k++)
        {
            //System.out.println("sub : " + chararray2[k]);
            int ascii2 = chararray2[k] - 'a';
            letters2[ascii2]++;
        }
        //comparing the 2 frequencies
        for(int j = 0 ;j < 26 ;j++)
        {
            //System.out.print("letters : " + letters[j]);
            //System.out.println(" , letters2 : " + letters2[j]);
            if(letters[j] == letters2[j])
            flag++;
        }
        if(flag == 26)
        {
            //System.out.println("sub : " + sub);
            output.add(i);
        }
    }
    return output;
    }
}