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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
       qu.offer(root);
       while(!qu.isEmpty()){
        int size=qu.size();
         ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<size;i++){
          TreeNode node=qu.poll();
          if(node.left!=null)qu.offer(node.left);
          if(node.right!=null)qu.offer(node.right);
       
        list2.add(node.val);
       
        }
        list.add(list2);
       
       }
        return list;
    }
}