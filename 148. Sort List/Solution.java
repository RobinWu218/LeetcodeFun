/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = head, fast = head, preHead = dummy;
        while (fast != null && fast.next != null){
            preHead = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preHead.next = null;
        ListNode left = sortList(dummy.next);
        ListNode right = sortList(slow);
        return mergeSortedList(left, right);
    }
    
    public ListNode mergeSortedList(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode iter = dummy;
        while (left != null && right != null){
            if (left.val < right.val){
                iter.next = left;
                left = left.next;
            }else{
                iter.next = right;
                right = right.next;
            }
            iter = iter.next;
        }
        iter.next = (left == null) ? right : left;
        return dummy.next;
    }
}