class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode leftNode = invertTree(root.right);
        TreeNode rightNode = invertTree(root.left);
        root.left = leftNode;
        root.right = rightNode;
        return root;

    }
}
