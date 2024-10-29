class Solution:
    def choose(self,n, k):
        if k < 0 or k > n:
            return 0
        if k == 0 or k == n:
            return 1

        # Initialize variables to store factorials
        numerator = 1
        denominator = 1

        # Calculate numerator (n!)
        for i in range(n, max(k, n - k), -1):
            numerator *= i

        # Calculate denominator (k!)
        for i in range(1, min(k, n - k) + 1):
            denominator *= i

        return numerator // denominator
    
    def getRow(self, rowIndex: int) -> List[int]:
        lst = []
        for i in range(0,rowIndex+1,1):
            lst.append(self.choose(rowIndex,i))
        return lst