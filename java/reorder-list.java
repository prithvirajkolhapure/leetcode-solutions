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
    public void reorderList(ListNode head) {

        if(head.next==null&&head.next==null)
             return;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode prev=null;
        ListNode second=slow.next;
        slow.next=null;
        ListNode curr=second;
        while(curr!=null){
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }

        second=prev;
        ListNode first=head;
        while(second!=null){
            ListNode next1=first.next;
            ListNode next2=second.next;

            first.next=second;
            second.next=next1;

            first=next1;
            second=next2;
        }

   



    }
}