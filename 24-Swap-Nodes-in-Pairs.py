# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode(-1,head)
        prev = dummy

        while head and head.next:
            first = head
            second = head.next

            print(first.val)
            print(second.val)
            print(dummy.next)
            print(prev.val)
            print(head.val)
            prev.next = second
            print(first.val)
            print(second.val)
            print(dummy.next)
            print(prev.val)
            print(head.val)
            
            first.next = second.next
            second.next = first

            prev = first
            head = first.next
        return dummy.next