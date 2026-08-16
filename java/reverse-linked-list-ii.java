/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
   

    ListNode dummy=new ListNode(0);
    dummy.next=head;

    ListNode prevLeft=dummy;

    for(int i=1;i<left;i++)
        prevLeft=prevLeft.next;
    
    ListNode curr=prevLeft.next;
    ListNode prev=null;

    for(int i=0;i<=right-left;i++){
        ListNode nextTemp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextTemp;
    }
    ListNode leftNode=prevLeft.next;
    prevLeft.next=prev;
    leftNode.next=curr;
    return dummy.next;

    }
}