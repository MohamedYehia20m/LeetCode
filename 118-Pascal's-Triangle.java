class Solution {
    long partialfact(int x , int y)
    {
        long fact = 1;
        while(x>y)
        {
            fact *= x;
            x--;
        }
        return fact;
    }
    long combination(int n,int r){    // nCr 
        int diff = n - r;
        if(diff > r)
        {
            int temp = r; //swap
            r = diff;
            diff = temp;
        }
        return partialfact(n,r)/partialfact(diff,1);    
    }    
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> a = new ArrayList<List<Integer>>(); // mother-list
    for(int i = 0 ;i < numRows ;i++) //it have to start from zero
    {
        List<Integer> w = new ArrayList<Integer>();//son-list
        for(int j = 0 ;j <= i ;j++)
        {
            Long l = combination(i,j) ; //divide and then divide
            int num = l.intValue();
            /*System.out.print("i : " + i);
            System.out.println(" , j : " + j);
            System.out.println("combination(i,j) : " + combination(i,j));
            System.out.println(" , num : " + num);*/
            w.add(num);
        }
        a.add(w);
    }
    return a;
    }
}