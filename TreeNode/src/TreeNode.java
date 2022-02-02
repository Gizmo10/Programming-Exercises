import java.util.*;

public class TreeNode {

    int value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(){}

    public void minimalTree(int [] nodeValues){

        Queue<TreeNode> tempBuffer = new LinkedList<>();
        int valuesSize = nodeValues.length;
        int indexOfValue = 0;

        if(indexOfValue < valuesSize){

            this.value = nodeValues[indexOfValue];
            tempBuffer.add(this);
        }

        while(!tempBuffer.isEmpty()){

            TreeNode temp = tempBuffer.remove();
            indexOfValue++;

            if(indexOfValue < valuesSize){

                TreeNode leftNode = new TreeNode();
                leftNode.value = nodeValues[indexOfValue];
                temp.leftChild = leftNode;
                tempBuffer.add(leftNode);
            }

            indexOfValue++;

            if(indexOfValue < valuesSize){

                TreeNode rightNode = new TreeNode();
                rightNode.value = nodeValues[indexOfValue];
                temp.rightChild = rightNode;
                tempBuffer.add(rightNode);
            }
        }
    }

    public static void preorderTraversal(TreeNode root){

        if(root == null){

            return;
        }

        System.out.print(root.value);
        preorderTraversal(root.leftChild);
        preorderTraversal(root.rightChild);
    }

    public static LinkedList<LinkedList<TreeNode>> listOfDepths(TreeNode root){

        LinkedList<LinkedList<TreeNode>> depths = new LinkedList<>();
        LinkedList<TreeNode> depth = new LinkedList<>();

        if(root != null){

            depth.add(root);
        }

        while(depth.size() > 0) {

            depths.add(depth);

            LinkedList<TreeNode> parents = depth;
            depth = new LinkedList<>();

            for (TreeNode parent : parents) {

                if (parent.leftChild != null) {

                    depth.add(parent.leftChild);
                }

                if (parent.rightChild != null) {

                    depth.add(parent.rightChild);
                }
            }
        }

        return depths;
    }
}
