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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> list=new ArrayList<>();

        while(temp!=null){
          list.add(temp.val);
          temp=temp.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        for(int i=0;i<list.size();i++){
          ListNode tem=new ListNode(list.get(i));
          tail.next=tem;
          tail=tail.next; 
        }
        tail.next=null;
        return dummy.next;
    }
}