class Solution {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList();
        dfs(root,0);
        return res;
    }
    private void dfs(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(depth == res.size()){	
            res.add(root.val);
        }
        depth++;
        dfs(root.right,depth);
        dfs(root.left,depth);
        return;
    }
}

