/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    private ListNode frontNode;
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        frontNode = head;
        return helper(head);
    }
    
    private boolean helper(ListNode curHead){
        if(curHead == null){
            return true;
        }
        

        if(helper(curHead.next) == false) return false;
        if(curHead.val != frontNode.val) return false;
        frontNode = frontNode.next;
        
        return true;
    }
}
//      method 1:ArrayList
//     List<Integer> lst = new ArrayList<>();
//     while(head != null){
//         lst.add(head.val);
//         head = head.next;
//     }
//     int i = 0;
//     int j = lst.size() - 1;

//     while(i < j){

//         if(!lst.get(i).equals(lst.get(j))){
//             return false;
//         }else{
//             i++;
//             j--; 
//         }
//     }

//     return true;  

        
//         method 2: array
//         if(head == null || head.next == null) return true;
        
//         int length = 0;
//         ListNode cur = head;
//          while(cur != null){
//              length++;
//              cur = cur.next;
//          }
        
//         int[] array = new int[length];
//         for(int i = 0; i < length; i++){
//              array[i] = head.val;
//              head = head.next;
//          }
        
//         int i = 0;
//         int j = length - 1;
//         while(i < j){
//             if(array[i] != array[j]){
//                 return false;
//             }else{
//                 i++;
//                 j--;
//             }
//         }
//         return true;


//         method 3: reverse Linked lisst
//         if(head == null || head.next == null) return true;
//         ListNode slow = head;
//         ListNode fast = head;
        
//         while(fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
        
//         ListNode cur = slow;
//         ListNode pre = null;
//         while(cur != null){
//             ListNode next = cur.next;
//             cur.next = pre;
//             pre = cur;
//             cur = next;
//         }
        
//         while(pre != null &&  head != null){
//             if(pre.val == head.val){
//                 pre = pre.next;
//                 head = head.next;
//             }else{
//                 return false;
//             }
            
//         }
//         return true;