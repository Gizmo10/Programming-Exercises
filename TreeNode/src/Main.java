public class Main {

    public static void main(String[] args){

        int [] values = {1,3,5,7,9,10,13,19};
        TreeNode root = new TreeNode();

        root.minimalTree(values);
        TreeNode.preorderTraversal(root);
    }
}
