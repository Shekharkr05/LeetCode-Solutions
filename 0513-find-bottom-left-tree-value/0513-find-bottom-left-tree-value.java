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
    public int findBottomLeftValue(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
       q.offer(root);
       int level=depth(root);
       int ans=0;
       while(!q.isEmpty()){
        int s=q.size();
        level--;
        for(var i=0;i<s;i++){
            TreeNode node=q.poll();
            if(level==0&&i==0)ans=node.val;
            if(node.left!=null)q.offer(node.left);
            if(node.right!=null)q.offer(node.right);
        }
        
       }
        return ans;
    }
    int depth(TreeNode root){
        if(root==null)return 0;
        int left=depth(root.left);
        int right=depth(root.right);
        return 1+Math.max(left,right);
    }
}