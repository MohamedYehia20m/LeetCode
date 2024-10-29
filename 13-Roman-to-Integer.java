class Solution {
    public int romanToInt(String s) {
    //char [] chararray = s.toCharArray();
    int sum = 0;
    for(int i = 0 ; i < s.length() ;i++ )
    {
        switch(s.charAt(i))
        {
            case 'M':
            sum += 1000;
            break;
            case 'D':
            sum += 500;
            break;
            case 'L':
            sum += 50;
            break;
            case 'V':
            sum += 5;
            break;
            case 'C':
            if((i+1) < s.length())
            {
                if(s.charAt(i+1) == 'D')
                {
                    sum += 400;
                    i++;
                    break;
                }
                if(s.charAt(i+1) == 'M')
                {
                    sum += 900;
                    i++;
                    break;
                }
                else
                {
                    sum += 100; //original value;
                    break;
                }
            }
            else
            {
                sum += 100; //original value;
                break;
            }
            case 'X':
            if((i+1) < s.length())
            {
                if(s.charAt(i+1) == 'L')
                {
                    sum += 40;
                    i++;
                    break;
                }
                if(s.charAt(i+1) == 'C')
                {
                    sum += 90;
                    i++;
                    break;
                }
                else
                {
                    sum += 10; //original value;
                    break;
                }
            }
            else
            {
                sum += 10; //original value;
                break;
            }
            case 'I':
            if((i+1) < s.length())
            {
                if(s.charAt(i+1) == 'V')
                {
                    sum += 4;
                    i++;
                    break;
                }
                if(s.charAt(i+1) == 'X')
                {
                    sum += 9;
                    i++;
                    break;
                }
                else
                {
                    sum += 1; //original value;
                    break;
                }
            }
            else
            {
                sum += 1; //original value;
                break;
            }
        }
    }
    return sum;   
    }
}