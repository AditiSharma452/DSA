package aditi.Trees;

//Definition for a binary tree node.
public class DiameterOfBinaryTree {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        height(root);
        return ans;
    }
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left_height = height(root.left);
        int right_height = height(root.right);
        ans = Math.max(ans, left_height + right_height);
        return Math.max(left_height, right_height) + 1;
    }
}
