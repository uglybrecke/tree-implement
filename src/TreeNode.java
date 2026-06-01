public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    //base constructor
    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    //leaf nodes, null children
    public TreeNode(int value) {
        this.value = value;
    }

    // instead of building a bunch of overloaded methods(same name different types) 
    // just use:
    // public myNode = new TreeNode(value, null, TreeNode left)

    // public TreeNode(int value, TreeNode left) {
    //     this.value = value;
    //     this.left = left;
    // }

    // public TreeNode(int value, TreeNode left) {
    //     this.value = value;
    //     this.left = left;
    // }
  
}