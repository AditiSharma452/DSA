package aditi.Trees;

public class Maximum_Path_Sum {
    public int maximumSum;
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);

        //Sum should be positive for maximum value
        leftSum = Math.max(leftSum, 0);
        rightSum = Math.max(rightSum, 0);

        int currSum = leftSum + rightSum + root.val;
        maximumSum = Math.max(currSum, maximumSum);
        return Math.max(leftSum, rightSum) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        maximumSum = Integer.MIN_VALUE;
        dfs(root);
        return maximumSum;
    }
}
