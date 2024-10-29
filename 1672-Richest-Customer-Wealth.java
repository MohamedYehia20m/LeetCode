class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length; //no. of customers
        int coulmns = accounts[0].length; //no.of banks
        int max = accounts[0][coulmns-1];
        for(int i=0 ; i < rows ; i++)
        {
            for(int j = 1 ; j < coulmns ; j++ )
            {
                accounts[i][j] += accounts[i][j-1];  
            }
            if(accounts[i][coulmns-1] > max)
            max = accounts[i][coulmns-1];
        }
    return max;
    }
}