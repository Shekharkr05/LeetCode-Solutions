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
        if(head==null||head.next==null||left==right)return head;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        int index=1;
        while(temp!=null){
            if(index>=left&&index<=right)list.add(temp.val);
            temp=temp.next;
            index++;
        }
        index=1;
        temp=head;
        int i=1;
        System.out.println(list);
        while(temp!=null){
            if(index>=left&&index<=right){
                temp.val=list.get(list.size()-i);
                i++;
            }
            index++;
            temp=temp.next;
        }
        return head;
    }
}