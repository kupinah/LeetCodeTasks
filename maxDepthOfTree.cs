class maxdepthoftree{
    public int MaxDepth(TreeNode root) {
        if(root == null) return 0;
        int lMax = 1 + MaxDepth(root.left);
        int rMax = 1 + MaxDepth(root.right);
        return (lMax < rMax) ? rMax : lMax; 
    }
}