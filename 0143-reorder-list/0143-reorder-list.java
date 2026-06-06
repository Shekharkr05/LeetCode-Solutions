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
     ListNode temp=head;
     int length=0;
     while(temp!=null){
        length++;
        temp=temp.next;
     }
     temp=head;
     int arr[]=new int[length];
     for(int i=0;i<length;i+=2){
        arr[i]=temp.val;
        temp=temp.next;
}
int k=(length%2==0)?length-1:length-2;
for(int i=k;i>0;i-=2){
        arr[i]=temp.val;
        temp=temp.next;
}
temp=head;
int i=0;
while(temp!=null){
    temp.val=arr[i];
    temp=temp.next;
    i++;
}

    }

}