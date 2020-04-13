/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //silding window O()
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = dummyHead;
        
        while(n >= 0){
            cur = cur.next;
            n--;
        }
        
        while(cur != null){
            cur = cur.next;
            pre = pre.next;
        }
        
        pre.next = pre.next.next;
        
        return dummyHead.next;
        
    }
}