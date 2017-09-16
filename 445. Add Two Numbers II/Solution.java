/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode h1 = l1, h2 = l2;
        while (h1 != null || h2 != null){
            if (h1 != null){
                s1.push(h1.val);
                h1 = h1.next;
            }
            if (h2 != null){
                s2.push(h2.val);
                h2 = h2.next;
            }
        }
        ListNode dummy = new ListNode(0), cur;
        int curry = 0, sum = 0;
        while (!s1.isEmpty() || !s2.isEmpty() || curry != 0){
            sum = curry;
            sum += s1.isEmpty()? 0 : s1.pop();
            sum += s2.isEmpty()? 0 : s2.pop();
            cur = new ListNode(sum%10);
            cur.next = dummy.next;
            dummy.next = cur;
            curry = sum / 10;
        }
        return dummy.next;
    }
}