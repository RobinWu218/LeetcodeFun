/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tail = head;
        if (tail == null) return tail;
        int count = 1;
        while(tail.next != null){
            tail = tail.next;
            count++;
        }
        k %= count;
        if (k==0) return head;
        int n = count - k;
        ListNode newTail = head;
        while (n-1 > 0){
            newTail = newTail.next;
            n--;
        }
        ListNode newHead = newTail.next;
        tail.next = head;
        newTail.next = null;
        return newHead;
    }
}