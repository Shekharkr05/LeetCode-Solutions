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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;

        }
        
        int arr[]=new int[length];
        temp=head;
        int j=0;
        while(temp!=null){
            arr[j]=temp.val;
            j++;
            temp=temp.next;
        }
       int temp1=arr[k-1];
        arr[k-1]=arr[length-k];
        arr[length-k]=temp1;
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
         
       for(int i=0;i<length;i++){
        ListNode node=new ListNode(arr[i]);
        tail.next=node;
        tail=tail.next;
       }
        return dummy.next;
    }
}