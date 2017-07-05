/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int longestConsecutive(TreeNode root) {
      
        // return dfs(root, 1, root.val); //wrong, if root == null
        if(root == null) return 0;
        return dfs(root, 1, root.val);
    }
    public int dfs(TreeNode root, int count, int preVal){
        if(root == null) return count;
        count = root.val - preVal == 1 ?  count+1:1;
        
        int left = dfs(root.left, count, root.val);
        int right = dfs(root.right, count, root.val);
        return Math.max(count, Math.max(left, right));
    }
}
