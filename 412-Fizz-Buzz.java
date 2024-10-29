class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>(); 
        for(int i = 0 ;i < n ;i++ )
        {
            int f = i + 1; // considering index
            if(f % 5 == 0 && f % 3 == 0)
                answer.add("FizzBuzz");
            else if(f % 5 == 0)
                answer.add("Buzz");
            else if(f % 3 == 0)
                answer.add("Fizz");
            else
            {
                String num = String.valueOf(f); 
                answer.add(num);
            }
                
        }
    return answer;
    }
}