/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 1, len2 = 1;
        if (headA == null || headB == null) return null;
        ListNode iterA = headA, iterB = headB;
        while(iterA.next!=null){
            iterA = iterA.next;
            len1++;
        }
        while(iterB.next!=null){
            iterB = iterB.next;
            len2++;
        }
        if (iterA.val != iterB.val) return null;
        iterA = headA;
        iterB = headB;
        int diff = Math.abs(len1 - len2);
        
        if (len1 > len2){
            iterA = advanceByK(iterA,diff);
        }else{
            iterB = advanceByK(iterB,diff);
        }
        
        while(iterA.val != iterB.val){
            iterA = iterA.next;
            iterB = iterB.next;
        }
        return iterA;
    }
    
    public ListNode advanceByK(ListNode iter, int diff){
        while (diff-->0){
            iter = iter.next;
        }
        return iter;
    }
}