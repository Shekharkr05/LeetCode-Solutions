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
    public ListNode swapPairs(ListNode head) {
       ListNode temp=head;
       if(head==null||head.next==null)return head;
       ArrayList<Integer> list=new ArrayList<>();
       while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
       }
       for(int i=0;i<list.size()-1;i+=2){
      int temp1=list.get(i+1);
      list.set(i+1,list.get(i));
       list.set(i,temp1);

       }
       ListNode dummy=new ListNode();
       ListNode tail=dummy;
       for(int i=0;i<list.size();i++){
        ListNode node=new ListNode(list.get(i));
        tail.next=node;
        tail=tail.next;
       }
       tail.next=null;
       return dummy.next;
      
    }
    }