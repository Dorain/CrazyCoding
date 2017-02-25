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
    public int kthSmallest(TreeNode root, int k) {
        // the O(height) can be achived when new feature added
        int count = countNodes(root.left);
        if(count+1 == k) return root.val;
        if(count >= k) return kthSmallest(root.left, k);
        else return kthSmallest(root.right, k - count -1); // count the rooot
        
    }
    public int countNodes(TreeNode t){
        if(t == null) return 0;
        return countNodes(t.left) + countNodes(t.right) + 1;
    }
    
}