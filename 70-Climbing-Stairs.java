class Solution {
    public int climbStairs(int n) {
        int [] val = new int [n +1];
        if(n == 1)
        return 1;
        if(n == 2)
        return 2;
        else
        {
            val[1] = 1;
            val[2] = 2;
            for(int i = 3 ;i < (n + 1);i++)
            {
                val[i] = val[i - 1] + val[i - 2];
            }
        }
    return val[n];
    }
}