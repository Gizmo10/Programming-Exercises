import java.util.ArrayList;
import java.util.Collections;

public class GraphVertex {

    public int value;
    public ArrayList<GraphVertex> adjacentVertices = new ArrayList<>();
    public boolean marked = false;

    public GraphVertex(int i){

        this.value = i;
    }

    public void addChild(GraphVertex neighbor){

        adjacentVertices.add(neighbor);
    }
}
