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
    private int k = 0; 
    
    private int searchnum(int val, int[] inorder, int start, int end) {
        for (int j = start; j <= end; j++) {
            if (inorder[j] == val) {
                return j;
            }
        }
        return -1;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start = 0;
        int end = inorder.length - 1;
        return findtree(preorder, inorder, start, end);
    }
    
    private TreeNode findtree(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int val = preorder[k++];
        TreeNode root = new TreeNode(val);
        
        if (start == end) {
            return root;
        }
        
        int ind = searchnum(val, inorder, start, end);
        
        root.left = findtree(preorder, inorder, start, ind - 1);
        root.right = findtree(preorder, inorder, ind + 1, end);
        
        return root;
    }
}
