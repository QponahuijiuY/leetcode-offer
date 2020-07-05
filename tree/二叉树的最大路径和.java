class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfs(root);
        return res;
    }
    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = Math.max(0,dfs(root.left));
        int rightMax = Math.max(0,dfs(root.right));
        res = Math.max(res, root.val + leftMax + rightMax); // 更新res
        return root.val + Math.max(leftMax, rightMax);
    }
}
