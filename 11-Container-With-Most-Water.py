
class Solution:
    def maxArea(self, height: List[int]) -> int:
        
        firstdx = 0
        lastdx = len(height) - 1
        vol = 0

        while lastdx > firstdx :
            vol = max(vol , (lastdx - firstdx) * min(height[firstdx],height[lastdx]))
            if height[firstdx] > height[lastdx] :
                lastdx -= 1
            else :
                firstdx += 1
             
        return vol
