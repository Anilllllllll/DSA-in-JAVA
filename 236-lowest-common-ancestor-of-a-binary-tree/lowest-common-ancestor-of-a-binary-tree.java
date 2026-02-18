/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static int min;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        min=Integer.MIN_VALUE;
        
        return lca(root,p,q);
    }

    static TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left = lca(root.left,p,q);
        TreeNode right = lca(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        return (left!=null)? left: right;
    }
}