/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode front = dummy;
        ListNode iter = front.next;
        while (iter != null){
            while (iter.next!=null && iter.next.val == iter.val){
                iter = iter.next;
            }
            if (front.next == iter){
                front = front.next;
            }else{
                front.next = iter.next;
            }
            iter = iter.next;
        }
        return dummy.next;
    }
}