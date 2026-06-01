public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);

    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);


    root.right = new TreeNode(15,
                            new TreeNode(-3), 
                            new TreeNode(5, 
                                        null, 
                                        new TreeNode(22)
                                        )
                            );
    System.out.println("preorder:");
    preorder(root);
    
    System.out.println("postorder:");
    postorder(root);

    System.out.println("in order:");
    inorder(root);
  }
  /*
  **************************************************** END OF MAIN ****************************************************
  */

  //prints all nodes in a preorder way
  public static void preorder(TreeNode current) {
    if(current == null) return;

    System.out.println(current.value);

    // explore left (a method that calls itself, recursive)
    preorder(current.left);
    // explore right ()
    preorder(current.right);
    }

    //if you need information about the smaller nodes first, ie an image in html, can't put a box around it
    public static void postorder(TreeNode current) {
      if(current == null) return;
      postorder(current.left);
      postorder(current.right);
      System.out.println(current.value);
      }


    //left -> root -> right
    public static void inorder(TreeNode current) {
      if(current == null) return;
      inorder(current.left);
      System.out.println(current.value);
      inorder(current.right);
    }
  }
