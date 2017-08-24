/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummyLeft = new ListNode(0), dummyRight = new ListNode(0);
        ListNode leftIter = dummyLeft, rightIter = dummyRight, iter = head;
        while(iter != null){
            if (iter.val < x){
                leftIter.next = iter;
                leftIter = iter;
            }else{
                rightIter.next = iter;
                rightIter = iter;
            }
            iter = iter.next;
        }
        rightIter.next = null;
        leftIter.next = dummyRight.next;
        return dummyLeft.next;
        
        
    }
}