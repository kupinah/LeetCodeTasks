import jdk.nashorn.api.tree.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class convertBST {
    public TreeNode convertBST(TreeNode root){
        if(root == null) return null;
        convertBST(root, 0);
        return root;
    }
    public static int convertBST(TreeNode root, int sum) {
        if(root.right != null) 
            sum = convertBST(root.right, sum);

        sum = sum + root.val;        
        root.val = sum;
    
        if(root.left != null) 
            sum = convertBST(root.left, sum);

        return sum;        
    }
}