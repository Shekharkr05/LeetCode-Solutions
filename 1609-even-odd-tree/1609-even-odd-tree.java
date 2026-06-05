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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)return false;
        q.offer(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
             int prev=level%2!=0?Integer.MIN_VALUE:Integer.MAX_VALUE;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(level%2!=0&&(node.val%2==0||prev>=node.val))return false;
                if(level%2==0&&(node.val%2!=0||prev<=node.val))return false;

                prev=node.val;
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
               
            }
            level++;
        }
        return true;
    }
}