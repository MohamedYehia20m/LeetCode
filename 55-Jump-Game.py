class Solution:
    def canJump(self, nums: List[int]) -> bool:
        l = len(nums)
        goal = nums[l-1]
        goaldx = l - 1

        for i in range(l-2,-1,-1) :
            if nums[i] >= goaldx - i :
                goal = nums[i]
                goaldx = i
            
        if goaldx == 0 :
            return True
        else:
            return False
