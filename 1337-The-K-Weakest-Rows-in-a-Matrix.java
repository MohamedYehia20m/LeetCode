class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
     
    int rows = mat.length;
    int output[] = new int[k];
    int coulmns = mat[0].length;
    for(int i = 0;i < rows ;i++)
    {
        for(int j = 1;j < coulmns ;j++)
        {
            //System.out.print("i : " + i);
            //System.out.println(" , j : " + j);
            //System.out.println("mat[i][j] : " + mat[i][j]);
            if(mat[i][j] == 1)
            {
                mat[i][0]++;
                //System.out.println("**mat[i][0] : " + mat[i][0]);
                //System.out.println("");
            }
            
        }
    }
    //finding the weakest k rows
    for(int j = 0 ;j < k ;j++)
    {
        int min = mat[0][0];
        int m = 0;
        for(int i = 0;i < rows ;i++)
        {
            //System.out.print("i : " + i);
            //System.out.println(" , mat[i][0] : " + mat[i][0]);
            if(mat[i][0] < min)
            {
                min = mat[i][0];
                //System.out.println("min : " + min);
                m = i;
            }
        }
        mat[m][0] = 101; //inf
        output[j] = m;
    }
    return output;    
    }
}