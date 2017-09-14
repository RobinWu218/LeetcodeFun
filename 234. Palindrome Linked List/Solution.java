/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head,preHead = head;
        while (fast!=null && fast.next != null){
            preHead = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preHead.next = null;
        ListNode h2 = reverse(slow), h1 = head;
        while (h1 != null && h2 != null){
            if (h1.val != h2.val) return false;
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode iter = head, nextNode = head;
        while (iter.next!=null){
            nextNode = iter.next;
            iter.next = nextNode.next;
            nextNode.next = dummy.next;
            dummy.next = nextNode;
        }
        return dummy.next;
    }
}