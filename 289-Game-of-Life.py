class Solution:
    def gameOfLife(self, b: List[List[int]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        row = len(b)
        col = len(b[0])

        #we have to differentiate between old 0s and 1s andnew ones
        # new 0 --> -1
        # new 1 --> 2

        neighbor = [ [-1,-1],[-1,0],[-1,1],[0,-1],[0,1],[1,-1],[1,0],[1,1] ] #neighbor direction
        for i in range(row):
            for j in range(col):
                count = 0 # no. of neighbors 
                for r,c in neighbor:
                    nr = i + r
                    nc = j + c

                    if 0 <= nr < row and 0 <= nc < col and abs(b[nr][nc]) == 1: #finding a neighbor !
                        count += 1
                
                if b[i][j] == 1 :
                    if count < 2 or count > 3 :
                        b[i][j] = -1

                else:
                    if count == 3 :
                        b[i][j] = 2
        for i in range(row):
            for j in range(col):
                if b[i][j] == 2 :
                   b[i][j] = 1
                elif b[i][j] == -1 :
                    b[i][j] = 0
