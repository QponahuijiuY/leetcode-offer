class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> list = new ArrayList();
        if(root == null) {return list;}
        queue.add(root);
        int step = 0;
        while(!queue.isEmpty()){
            list.add(new ArrayList<Integer>());
            int size = queue.size();
            for(int i = 0 ; i < size ; i ++){
                TreeNode cur = queue.peek();
                list.get(step).add(cur.val);
                if(cur.left != null)  queue.add(cur.left);
                if(cur.right != null)  queue.add(cur.right);
                queue.remove();
            }
            step++;
        }
        return list;
    }
}
