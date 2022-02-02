import java.util.LinkedList;
import java.util.Queue;

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
}
