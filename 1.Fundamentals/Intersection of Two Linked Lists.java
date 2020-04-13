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
    // Two pointers     O()
        ListNode curA = headA;
        ListNode curB = headB;
        
        while(curA != curB){
            if(curA == null){
                curA = headB;
            }else{
                curA = curA.next;
            }
            
            if(curB == null){
                curB = headA;
            }else{
                curB = curB.next;
            }
        }
        
        return curA;
    }
}

//  method 1: brute force    O()
//         ListNode curA = headA;
//         ListNode curB = null;
//         while(curA != null){
//             curB = headB;
//             while(curB != null){
//                 if(curB == curA){
//                     return curB;
//                 }
//                 curB = curB.next;
//             }
//             curA = curA.next;
//         }
//         return null;

// method 2: Hash Tabke     O()
//         ListNode curB = headB;
//         ListNode curA = headA;
//         Set<ListNode> nodeSet = new HashSet<>();
//         while(curB != null){
//             nodeSet.add(curB);
//             curB = curB.next;
//         }
//         while(curA != null){
//             if(nodeSet.contains(curA)){
//                 return curA;
//             }
//             curA = curA.next;
//         }
//         return null;