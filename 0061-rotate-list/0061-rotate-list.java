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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int length=1;
        if(k==0||head==null||head.next==null)return head;
        while(temp.next!=null){
        temp=temp.next;
        length++;
        }
        temp.next=head;
        temp=head;
        for(int i=1;i<length-(k%length);i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
return head;
    }
}