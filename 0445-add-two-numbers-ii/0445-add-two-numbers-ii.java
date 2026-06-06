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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       if(l1==null)return l2;
       if(l2==null)return l1;
       ListNode r1=rev(l1);
       ListNode r2=rev(l2);
       int carr=0;
       ListNode head=r1;
       ListNode tail=r1;
       while(r1!=null&&r2!=null){
        int sum=r1.val+r2.val+carr;
        r1.val=sum%10;
        carr=sum/10;
         tail=r1;
        r1=r1.next;
        r2=r2.next;
       

       }
       if(r1!=null){
        while(r1!=null){
        int sum=r1.val+carr;
        r1.val=sum%10;
        carr=sum/10;
        tail=r1;
        r1=r1.next;
        
        }
       }
        if(r2!=null){
        while(r2!=null){
        int sum=r2.val+carr;
        ListNode node =new ListNode(sum%10);
       tail.next=node;
       tail=tail.next;
        carr=sum/10;
        r2=r2.next;
       
        }
       }
       if(carr==1){
        ListNode node=new ListNode(1);
        tail.next=node;
       
       }
       
        return rev(head);
    }
    ListNode rev(ListNode l1){
        ListNode prev=null;
        ListNode curr=l1;
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