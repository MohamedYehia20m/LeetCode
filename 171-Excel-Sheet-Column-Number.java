class Solution {
    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int sum = 0;
        for(int i = 0 ; i < len ;i++ )
        {
            sum += (columnTitle.charAt(i) - 'A' + 1)*Math.pow(26 , (len - 1 - i) );
        } 
    return sum;
    }
}