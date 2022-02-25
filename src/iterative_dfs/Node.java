package iterative_dfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

    //variables que necesitamos 
    private String name;
    private int depthLevel = 0;
    private List<Node> adjacenciesList;

    //constructor
    public Node(String name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }
     
   //getters y setters 
    public void addNeighbour(Node node) {
        this.adjacenciesList.add(node);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepthLevel() {
        return depthLevel;
    }

    public void setDepthLevel(int depthLevel) {
        this.depthLevel = depthLevel;
    }

    public List<Node> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Node> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }
    
    //sobreescribir
    @Override
    public String toString() {
        return this.name;
    }

}
