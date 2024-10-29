class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Hashtable<String, Integer> hashtable = new Hashtable<>();
 
        HashMap <Character , Character> rep = new HashMap<>();
        //check each row
        for(int i = 0 ;i < 9 ;i++ )
        {
            rep = new HashMap<>();
            for(int l = 0 ;l < 9 ;l++ ) // check each element in row
            {
                if( rep.containsKey( board[i][l]) )
                return false;
                else if( Character.isDigit(board[i][l]) )
                {
                    rep.put(board[i][l] , board[i][l] );
                }
                
            }    
        } 
        //check each coulmn
        for(int j = 0 ;j < 9 ;j++ )
        {
            rep = new HashMap<>();
            for(int m = 0 ;m < 9 ;m++ ) // check each element in coulmn
            {
                if( rep.containsKey( board[m][j]) )
                return false;
                else if( Character.isDigit(board[m][j]) )
                rep.put( board[m][j] , board[m][j] );
            }
        }
        //check each sub-boxes
        for(int k = 0 ;k < 9 ;k++ )
        {
            rep = new HashMap<>();
            int row = (k/3)*3;
            int coulmn =(k%3)*3;
            for(int n = row ;n < row+3 ;n++)
            {
                for(int o = coulmn ;o < coulmn + 3 ;o++)
                {
                    if( rep.containsKey( board[n][o]) )
                        return false;
                    else if( Character.isDigit(board[n][o]) )
                        rep.put( board[n][o] , board[n][o] );
                }
            }
        }
    return true;
    }
}