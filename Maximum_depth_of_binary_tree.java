public class Maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;

        }
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }
}
