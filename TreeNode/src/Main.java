import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] values = {1, 3, 5, 7, 9, 10, 13, 19};
        TreeNode root = new TreeNode();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        root.minimalTree(values);
        //TreeNode.preorderTraversal(root);

        list = TreeNode.listOfDepths(root);

        for (Integer i : list.get(0)) {

            System.out.println(i);
        }
    }
}
