/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
    	//bubble sort
        // if (head == null || head.next == null) return head;
        // ListNode dummy = new ListNode(0);
        // dummy.next = head;
        // ListNode iter = dummy, minNext = dummy, start = dummy, nextNode = head;
        // while (iter.next!=null){
        //     while (iter.next!=null){
        //     	if(minNext.next.val > iter.next.val){
        //     		minNext = iter;
        //     	}
        //     	iter = iter.next;
        //     }
        //     ListNode minNextNext = minNext.next.next;
        //     if (start == minNext){
        //     	start = start.next;
        //     }else{
        //     	nextNode = start.next;
        //     	start.next = minNext.next;
        //     	start.next.next = nextNode; 
        //     	start = start.next;
        //     	minNext.next = minNextNext;
        //     }
        //     minNext = start;
        //     iter = start; 
        // }
        // return dummy.next;

        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy, iter = head, nextNode = null;
        while (iter!=null){
        	while (pre.next!=null && pre.next.val<iter.val){
        		pre = pre.next;
        	}
        	nextNode = iter.next;
        	iter.next = pre.next;
        	pre.next = iter;
        	pre = dummy;
        	iter = nextNode;
        }
        return dummy.next;
    }
}