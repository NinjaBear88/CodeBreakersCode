# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        
        visitedSet = set()
        
        while headA is not None:
            visitedSet.add(headA)
            headA = headA.next
        
        while headB is not None:
            if headB in visitedSet:
                return headB
            headB = headB.next;
            
        return None

#         curA = headA
#         curB = headB
        
#         while curA != curB:
#             if curA is None:
#                 curA = headB
#             else:
#                 curA = curA.next
            
#             if curB is None:
#                 curB = headA
#             else:
#                 curB = curB.next
        
#         return curA