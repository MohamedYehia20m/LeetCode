"""
class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        a , b , c = sys.maxsize , sys.maxsize , sys.maxsize 
        l = len(nums)
        for i in range(l) :
            if nums[i] <= a :
                a = nums[i] 
                print("/" , a , b , c , "/")
            
            elif nums[i] < b   :
                b = nums[i] 
                print("/" , a , b , c , "/")

            elif nums[i] > b  and nums[i] > a:
                c = nums[i]
                print("/" , a , b , c , "/")
                return True
        return False
"""
class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
        if not nums: return False
        first, second = float('inf'), float('inf')
        for num in nums:
            if num <= first:
                first = num
            elif num < second:
                second = num
            elif num > first and num > second:
                return True
        return False