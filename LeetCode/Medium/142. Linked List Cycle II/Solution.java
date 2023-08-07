/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){ // Cycle detected
               
               while(head!=slow){
                   head = head.next;
                   slow = slow.next;
               }
               
               return slow;
            }
        }
        return null;
    }
}
