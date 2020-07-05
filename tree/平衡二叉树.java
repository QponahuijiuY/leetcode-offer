class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.left) - height(root.right)) < 2; 
    }
    private int height(TreeNode root){
        if(root == null){
            return -1;
    
