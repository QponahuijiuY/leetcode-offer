class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root){
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode = lowestCommonAncestor(root.right,p,q);
        if(leftNode == null){
            return rightNode;
        }
        if(rightNode == null){
            return leftNode;
        }
        return root;
    }
}
