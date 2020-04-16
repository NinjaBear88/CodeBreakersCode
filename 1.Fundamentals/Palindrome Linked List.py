# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def isPalindrome(self, head):
        if head is None or head.next is None:
            return True
        
        fast = head;
        slow = head;
        
        while fast.next is not None and fast.next.next is not None:
            fast = fast.next.next
            slow = slow.next
            
        cur = slow;
        pre = None;
        while cur is not None:
            next = cur.next
            cur.next = pre
            pre = cur
            cur = next
        
        while pre is not None and head is not None:
            if pre.val != head.val:
                return False
            pre = pre.next;
            head = head.next;
              
        return True
    
    
#         def isPalindrome(self, head):
#         lst = [] 
#         while head is not None:
#             lst.append(head.val)
#             head = head.next;
        
#         i = 0
#         j = len(lst) - 1
        
#         while i < j:
#             if lst[i] != lst[j]:
#                 return False
            
#             i += 1
#             j -= 1
        
    
#         return True