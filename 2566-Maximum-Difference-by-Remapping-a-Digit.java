class Solution {
    public int minMaxDifference(int num) {
        int digit = 0;
        int len = 0;
        if(num == 100000000 ) //9 digits
        {digit = num/100000000;
         len = 9;}
        
        if( num <= 99999999 && 10000000 <= num )
        {digit = num/10000000;
         len = 8;}
        
        if( num <= 9999999 && 1000000 <= num)
        {digit = num/1000000;
         len = 7;}
        
        if( num <= 999999 && 100000 <= num)
        {digit = num/100000;
         len = 6;}
        
        if( num <= 99999 && 10000 <= num)
        {digit = num/10000;
         len = 5;}
        
        if( num <= 9999 && 1000 <= num)
        {digit = num/1000;
         len = 4;}
        
        if(num <= 999 && 100 <= num)
        {digit = num/100 ;
         len = 3;}
        
        if(num <= 99 && 10 <= num)
        {digit = num/10;
         len = 2;}
        
        if(num <= 9 && 1 <= num)
        {digit = num;
         len = 1;}
        
               
        int [] arrmax = new int [len];
        int [] arrmin = new int [len];
        for(int i = 0 ; i< len ; i++) //dividing number to digits
        {
            arrmax[i] = num % 10;
            arrmin[i] = num % 10;
            num /= 10;
        }
        int maxdigit = digit;
        int x = len -1;
        for(int i = 0 ; i< len ; i++) //if digit is 9 //max
            {   while(maxdigit == 9 && x > 0)
                {
                    maxdigit = arrmax[--x];
                
                }
                if(arrmax[i] == maxdigit )
                {
                    arrmax[i] = 9;
                }
            }
        
            int max = arrmax[0];
            for(int i = 1 ; i< len ; i++) //returning number
            {
                max += arrmax[i]*Math.pow(10,i); 
            }
        int maxdifference = max - num;
        
        System.out.println("maxdiff : " + maxdifference);  //min
        
        for(int i = 0 ; i< len ; i++)
            {
                if(arrmin[i] == digit )
                {
                    arrmin[i] = 0;
                }
            }
         int min = arrmin[0];
            for(int i = 1 ; i< len ; i++) //returning number
            {
                min += arrmin[i]*Math.pow(10,i); 
            }
        int mindifference = min - num;
        System.out.println("mindiff : " + mindifference);
      
        int minmax = maxdifference - mindifference;
        
        return minmax;
    }
}