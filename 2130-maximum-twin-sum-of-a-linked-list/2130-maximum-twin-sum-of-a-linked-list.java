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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
        }
        int n=list.size();
        int sum=list.get(0)+list.get(n-1);
        int max=list.get(0)+list.get(n-1);
        for(int i=0;i<n/2;i++){
            sum=list.get(i)+list.get(n-1-i);
            max=Math.max(max,sum);

        }
        return max;
    }
}