# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummyHead = ListNode(0);
        dummyHead.next = head;
        cur = dummyHead;
        pre = dummyHead;
        
        while n >= 0:
            cur = cur.next
            n -= 1
        
        while cur != None:
            cur = cur.next
            pre = pre.next
        
        pre.next = pre.next.next
        
        return dummyHead.next