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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> lt = new ArrayList<>();
        List<Integer> lt2 = new ArrayList<>();
        findsum(root,targetSum,lt,lt2,0);
        return lt;
    }

    void findsum(TreeNode root,int targetSum,List<List<Integer>> lt,List<Integer> lt2,int sum){
        
        if(root==null){
            return;
        }
        lt2.add(root.val);
        sum = sum+root.val;
        if(root.left==null && root.right==null){
            
            if(sum==targetSum){
            List<Integer> ans = new ArrayList<>(lt2);
            lt.add(ans);
            }
        }

        findsum(root.left,targetSum,lt,lt2,sum);
        findsum(root.right,targetSum,lt,lt2,sum);
        lt2.remove(lt2.size()-1);
        
    }

}