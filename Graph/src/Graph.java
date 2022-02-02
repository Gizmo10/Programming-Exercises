import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    public ArrayList<GraphVertex> vertices = new ArrayList<>();

    public void buildGraph(ArrayList<GraphVertex> nodes){

        for(GraphVertex v: nodes){

            vertices.add(v);
        }
    }

    public boolean isThereAPath(GraphVertex one, GraphVertex two){

        Queue<GraphVertex> temporaryBuffer = new LinkedList<>();
        one.marked = true;
        temporaryBuffer.add(one);

        while(!temporaryBuffer.isEmpty()){

            GraphVertex temp = temporaryBuffer.remove();

            if(temp.value == two.value){

                return true;
            }

            for(GraphVertex v: temp.adjacentVertices){

                if(!v.marked){

                    v.marked = true;
                    temporaryBuffer.add(v);
                }
            }
        }

        return false;
    }
}
