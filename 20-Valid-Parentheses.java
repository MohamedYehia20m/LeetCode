class Solution {
    public boolean isValid(String s) {
        Stack stacko = new Stack();
        int slen = s.length();
        for(int i = 0 ;i < slen ;i++)
        {
            if( (s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{') ) //parantheses //curly bracket //square bracket
            stacko.push(s.charAt(i));
            else if (stacko.empty())
            return false; 
            else if ( ( (stacko.peek()).equals('(') && (s.charAt(i) == ')') )
             || ( (stacko.peek()).equals('[') && (s.charAt(i) == ']') )
             || ( (stacko.peek()).equals('{') && (s.charAt(i) == '}') ) )
            {
                stacko.pop();
            }
            else
            return false;
        }
        if(stacko.empty() )
        return true;
        else
        return false;
    }
}