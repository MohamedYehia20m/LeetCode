class Solution:
    def factorial (d : int) -> int:
        if d == 1 or d == 0 :
            return d
        else:
            return d*factorial(d-1)

    def uniquePaths(self, m: int, n: int) -> int: # we attempt to calculate zCx # zCx = (z!)/(x!)(Z!)
        return int( factorial(n + m - 2) / ( factorial(m - 1) * factorial(n - 1) ) )
