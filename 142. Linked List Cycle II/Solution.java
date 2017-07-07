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
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast){
                int length = 0;
                do {
                    fast = fast.next;
                    length++;
                }while (fast != slow);
                
                ListNode start1 = head;
                ListNode start2 = head;
                while(length-- > 0){
                    start2 = start2.next;
                }
                while(start1 != start2){
                    start1 = start1.next;
                    start2 = start2.next;
                }
                return start1;   
            }
        }
        return null;
    }
}