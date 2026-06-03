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
    public TreeNode searchBST(TreeNode root, int val) {
        return inorder(root,val);
    }
    private TreeNode inorder(TreeNode root,int val){
    if(root==null)return null;
    if(root.val==val)return root;
    TreeNode b=inorder(root.left,val);
    if(b!=null)return b;
    return inorder(root.right,val);
    
    }
}