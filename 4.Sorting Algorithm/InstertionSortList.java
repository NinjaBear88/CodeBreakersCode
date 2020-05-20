class Solution {
    public ListNode insertionSortList(ListNode head) {

        
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        ListNode cur = head;
        ListNode next = null;
        
        while(cur != null){
            next = cur.next;
            while(pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
            pre = dummyHead;
        }
        
        return dummyHead.next;
     
    }
}