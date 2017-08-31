/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head, pre = dummy;
        
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            pre = pre.next;
        }
        
        while (slow.next!=null){
            ListNode temp = slow.next;
            slow.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        
        ListNode fst = head, snd = pre.next, cur = dummy;
        pre.next = null;
        while (fst != null || snd != null){
            if (fst!= null){
                cur.next = fst;
                fst = fst.next;
                cur = cur.next;
            }
            
            if (snd!=null){
                cur.next = snd;
                snd = snd.next;
                cur = cur.next;
            }
        }
        cur.next = null;
    }
}