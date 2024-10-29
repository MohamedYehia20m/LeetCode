class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; //row
        int n = mat[0].length; //coulmn
        int size = m*n;
        int [] arr = new int [size];
        if(r * c != n * m)
        return mat;
        
        //converting 2d matrix to 1d array
        //converting 1d array to the newly 2d matrix
        int [][] op = new int [r][c];
        for(int i = 0 ;i < size ;i++)
        {
            op[i / c][i % c] = mat[i / n][i % n];
        }
        return op;
    }
}