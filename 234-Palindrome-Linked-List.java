/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int arr[] = new int [100001];
        int i = 0;
        int flag = 0;
        arr[0] = head.val;
        while((head.next) != null)
        {
            head = head.next;
            arr[++i] = head.val;
        }
        for(int j = 0; j <= (i/2) ;j++)
        {
            //System.out.println("(i/2) : " + (i/2));
            //System.out.println("j : " + j);
            //System.out.print("arr[j] : " + arr[j]);
            //System.out.println(" , arr[i-j] : " + arr[i-j]);
            if(arr[j] == arr[i-j])
            flag++;
        }
        if(flag == (i/2)+1)
        return true;
    return false;
    }
}