class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        intersection12 = list(set(nums1) & set(nums2))
        intersection23 = list(set(nums2) & set(nums3))
        intersection13 = list(set(nums1) & set(nums3))

        union = list(set(intersection12).union(intersection23, intersection13))
        return list(set(union))