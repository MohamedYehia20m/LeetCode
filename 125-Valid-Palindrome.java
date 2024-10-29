class Solution {
    public boolean isPalindrome(String s) {
        int slen = s.length(); 
        char [] schar = new char [slen];
        int counter = 0;
        char [] scharclean = new char [slen]; //need to clean the rest
        schar = s.toCharArray();
        for(int i = 0;i < slen;i++) //removing non-alphanumeric characters
        {
            if( Character.isLetterOrDigit( schar[i] ) )
            {
                scharclean[counter] = schar[i];
                counter++;
            }
        } //Character.toUpperCase(scharclean[counter - 1 - j])
        for(int j = 0 ;j < (counter/2) ;j++) //checking if its a palindrome //converting uppercase to lowercase
        {
            if( Character.compare(Character.toUpperCase(scharclean[j]) , Character.toUpperCase(scharclean[counter - 1 - j])) != 0 )
            {
                return false;
            }  
        }
    return true;
    }
}