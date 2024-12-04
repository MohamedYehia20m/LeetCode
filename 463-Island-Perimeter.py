class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        perimeter = 0
        rows = len(grid)
        cols = len(grid[0])

        for i in range(rows):
            for j in range(cols):
                if grid[i][j] == 1:
                    perimeter += 4
                    # check for adjacet land #check only above ad left ! # avoid redundancy
                    if i > 0 and grid[i - 1][j] == 1:
                        perimeter -= 2  # one for him and aother for neighbour
                    if j > 0 and grid[i][j - 1] == 1:
                        perimeter -= 2  # one for him and aother for neighbour

        return perimeter
