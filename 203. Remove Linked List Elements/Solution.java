/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur != null){
            ListNode nextNode = cur.next;
            if (nextNode!= null && nextNode.val == val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
            
        }
        return dummy.next;
    }
}