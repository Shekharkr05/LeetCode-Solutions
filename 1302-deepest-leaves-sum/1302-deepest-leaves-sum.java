/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int n=dept(root);
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return 0;
        q.offer(root);
        int lev=0;
        int sum=0;
        while(!q.isEmpty()){
            int s=q.size();
            lev++;
            for(int i=0;i<s;i++){
               TreeNode node=q.poll();
               if(lev==n){
              sum+=node.val;
               }
               if(node.left!=null)q.offer(node.left);
               if(node.right!=null)q.offer(node.right);
            }
        }
        return sum;
    }
        int dept(TreeNode root){
            if(root==null)return 0;
            int left=dept(root.left);
            int right=dept(root.right);
            return 1+Math.max(left,right);
        
    }
}