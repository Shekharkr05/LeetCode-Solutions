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
      
    /*   ListNode tail=l1;
       ListNode head=l1;
        int carry=0;
         while(l1!=null&&l2!=null){
            int sum=l1.val+l2.val;
             l1.val=(sum+carry)%10;
            carry=(sum+carry)/10;
            
           
            tail=l1;
            l1=l1.next;
            l2=l2.next;

         }
         while(l1!=null){
            int sum=l1.val+carry;
            l1.val=sum%10;
            carry=sum/10;
            tail=l1;
            l1=l1.next;
         }
         while(l2!=null){
            int sum=l2.val+carry;
            tail.next=new ListNode(sum%10);
           
            carry=sum/10;
            tail=tail.next;
            l2=l2.next;
         }
         if(carry==1)tail.next=new ListNode(1);
        return head;*/
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        if(l1==null)return l2;
        if(l2==null)return l1;
        int carry=0;
        while(l1!=null||l2!=null){
            int f=(l1==null)?0:l1.val;
            int s=(l2==null)?0:l2.val;
            int sum=f+s+carry;
            tail.next=new ListNode(sum%10);
            tail=tail.next;
            carry=sum/10;
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;

        }
        if(carry!=0)tail.next=new ListNode(carry);
        
        return dummy.next;
    }
}