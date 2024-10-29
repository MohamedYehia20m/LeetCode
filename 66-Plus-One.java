class Solution {
    public int[] plusOne(int[] digits) {
        int dlen = digits.length;
        boolean allnine = true;
        for(int i = 0;i < dlen ;i++) //all nine special case
        {
            if(digits[i] != 9)
            allnine = false;
        }
        if(allnine) //all nine special case - implementation
        {
            int [] op = new int [dlen + 1];
            op[0] = 1;
            return op;
        }
        // using same array
        int remainder = (digits[dlen - 1] + 1) % 10;
        int increment = (digits[dlen - 1] + 1) / 10; // intial increment
        //System.out.print(" , pre - increment : " + increment);
        digits[dlen - 1] = remainder;
        //System.out.println(" , pre - remainder : " + remainder);
        for(int j = dlen - 2 ;j >= 0 ; j--) //end??
        {
            //System.out.print("j : " + j);
            //System.out.print(" , digits[j] : " + digits[j]);
            remainder = (digits[j] + increment) % 10;
            increment = (digits[j] + increment) / 10;
            //System.out.print(" , remainder : " + remainder);
            //System.out.print(" , increment : " + increment);
            digits[j] = remainder;
            //System.out.println(" , digits[j] : " + digits[j]);
        }
    return digits;
    }
}