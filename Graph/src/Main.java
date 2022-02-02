import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        ArrayList<GraphVertex> graphVertices = new ArrayList<>();
        Graph g1 = new Graph();

        GraphVertex node1 = new GraphVertex(1);
        GraphVertex node2 = new GraphVertex(2);
        GraphVertex node3 = new GraphVertex(3);
        GraphVertex node4 = new GraphVertex(4);
        GraphVertex node5 = new GraphVertex(5);
        GraphVertex node6 = new GraphVertex(6);
        GraphVertex node7 = new GraphVertex(7);

        node1.addChild(node2);
        node1.addChild(node3);
        node1.addChild(node4);

        node3.addChild(node2);

        node4.addChild(node5);
        node4.addChild(node6);

        node5.addChild(node7);

        graphVertices.add(node1);
        graphVertices.add(node2);
        graphVertices.add(node3);
        graphVertices.add(node4);
        graphVertices.add(node5);
        graphVertices.add(node6);
        graphVertices.add(node7);

        g1.buildGraph(graphVertices);

        System.out.println(g1.isThereAPath(node2,node6));




    }
}
