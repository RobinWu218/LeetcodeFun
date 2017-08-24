/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        int len = 0;
        while (cur!=null){
            cur = cur.next;
            len++;
        }
        ListNode front = dummy;
        cur = head;
        for (int i = 0; i<len/k; i++){
            int count = k-1;
            while(count>0){
                ListNode nextNode = cur.next;
                cur.next = nextNode.next;
                nextNode.next = front.next;
                front.next = nextNode;
                count--;
            }
            front = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}