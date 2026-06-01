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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       int x=0;
       ListNode temp=list1;
       ListNode mp1=null;
       ListNode mp2=null;
      while(temp!=null){
     if(x==a-1)mp1=temp;
     if(x==b+1){mp2=temp;
     break;
     }
     x++;
     temp=temp.next;
      }
      
      temp=list2;
      mp1.next=temp;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=mp2;

       return list1;
    }
}