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
    public int[] nextLargerNodes(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
        length++;
        temp=temp.next;
        }
        int i=0;
        temp=head;
        int arr[]=new int[length];
        while(temp!=null){
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        int ans[]=new int[length];
       for(int j=0;j<length;j++){
        for(int k=j+1;k<length;k++){
            if(arr[j]<arr[k]){
                ans[j]=arr[k];
                break;
            }
        }
       }
         
        return ans;
    }
}

