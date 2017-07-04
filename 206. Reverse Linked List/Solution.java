/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = new ListNode(0);
        current.next = head;
        ListNode start = current.next;
        if (start == null) return head;
        while(start.next!=null){
            ListNode temp = start.next;
            start.next = temp.next;
            temp.next = current.next;
            current.next = temp;   
        }
        return current.next;
    }
}