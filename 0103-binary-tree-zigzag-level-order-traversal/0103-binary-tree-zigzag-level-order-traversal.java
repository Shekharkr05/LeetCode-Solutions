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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        Deque<TreeNode> q=new ArrayDeque<>();
        if(root==null)return list;
        q.offer(root);
        boolean rev=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list2=new ArrayList<>();
            for(int i=0;i<size;i++){
               
                if(rev==false){
                     TreeNode node=q.pollFirst();
                list2.add(node.val);
                 if(node.left!=null)q.offerLast(node.left);
                 if(node.right!=null)q.offerLast(node.right);
                   }else{
                     TreeNode node=q.pollLast();
                list2.add(node.val);
                if(node.right!=null)q.offerFirst(node.right);
                     if(node.left!=null)q.offerFirst(node.left);
                      }
            }
            rev=!rev;
            list.add(list2);
        }
        return list;
    }
}