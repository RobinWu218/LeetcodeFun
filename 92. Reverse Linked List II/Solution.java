/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int count = 1;
        while (count < m){
            cur = cur.next;
            count++;
        }
        //front is moving while cur is the head and stuck
        ListNode front = cur.next;
        while (m < n){
            ListNode temp = front.next;
            front.next = temp.next;
            temp.next = cur.next;
            cur.next = temp;
            m++;
        }
        return dummy.next;
    }
}