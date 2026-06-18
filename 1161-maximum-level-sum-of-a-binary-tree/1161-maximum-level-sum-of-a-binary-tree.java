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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        
        int lev=0;
        if(root==null)return lev;
        q.offer(root);
        int maxLev=1;
        int max=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
             lev++;
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
             sum+=node.val;
            
             if(node.left!=null)q.offer(node.left);
             if(node.right!=null)q.offer(node.right);
            }
            if(sum>max){
                max=sum;
               maxLev=lev;
            }


        }

        return maxLev;
    }
}