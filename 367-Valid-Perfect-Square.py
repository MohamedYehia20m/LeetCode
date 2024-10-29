class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        x = 1
        while x*x < num:
            x +=1
        if x*x == num:
            return True
        else:
            return False 