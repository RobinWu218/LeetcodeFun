/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode front = cur.next;
        while (front != null && front.next != null){
            ListNode temp = front.next;
            front.next = temp.next;
            temp.next = front;
            cur.next = temp;
            cur = cur.next.next;
            front = cur.next;
        }
        return dummy.next;
    }
}