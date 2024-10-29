/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //creating two pointers to know the length of each list without moving
        ListNode a = headA;
        ListNode b = headB;
        //two counters to store the length of each list
        int ac = 0;
        int bc = 0;
        while(a != null)
        {
            ac++;
            a = a.next;
        }
        while(b != null)
        {
            bc++;
            b = b.next;
        }
        while(ac>bc)
        {
            headA = headA.next;
            ac--;
        }
        while(ac<bc)
        {
            headB = headB.next;
            bc--;
        }
        while(headA != headB)
        {
            headA = headA.next;
            headB = headB.next;
        }
        if(headA == headB)
        return headA;
    return null;
    }
}