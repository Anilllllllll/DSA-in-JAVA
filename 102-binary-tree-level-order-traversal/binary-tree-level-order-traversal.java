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
        
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        List<List<Integer>> ans = new LinkedList<>();

        if(root==null) return ans;

        while(!q.isEmpty()){

            int size = q.size();
            List<Integer> l1 = new ArrayList<>();
            for(int i=0; i<size; i++){

                TreeNode a = q.poll();

                l1.add(a.val);

                if(a.left!=null){
                    q.offer(a.left);
                }
                if(a.right!=null){
                    q.offer(a.right);
                }

            }
            ans.add(l1);
        }
        return ans;
    
    }
}