/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        ListNode* mid = head ;
        int i = 0;
        while((head -> next) != NULL  )
        {
            head = head -> next;
            if(i%2 == 0)
            mid = mid -> next;
            ++i;
            //cout<<"i : "<<i<<" , head : "<<(head -> val)<<" , mid : "<<(mid -> val)<<endl;
        }
    return mid;
    }
};