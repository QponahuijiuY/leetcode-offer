class Solution {
    int res = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return res;
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            res = Math.max(res,leftDepth + rightDepth);
            return Math.max(leftDepth,rightDepth) + 1;
        }
    }
}

