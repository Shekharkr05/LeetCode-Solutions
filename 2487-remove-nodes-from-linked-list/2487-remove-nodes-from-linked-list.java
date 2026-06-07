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
    public ListNode removeNodes(ListNode head) {
        if(head==null||head.next==null)return head;
       head=rev(head);
       ListNode temp=head;
       int max=Integer.MIN_VALUE;
       ListNode dummy=new ListNode();
       ListNode tail=dummy;
        while(temp!=null){
            if(temp.val>=max){
                tail.next=temp;
                  max=temp.val;
                tail=tail.next;
             
            }
           temp=temp.next;

        }
        tail.next=null;
       return rev(dummy.next);
    }
    ListNode rev(ListNode curr){
        ListNode prev=null;
        ListNode next=curr.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)next=next.next;
        }
        return prev;
    }
}