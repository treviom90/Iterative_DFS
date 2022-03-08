
package iterative_dfs;

public class App {
    
    public static void main(String[] args ){
        //declaramos los nodos
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");
        Node node4 = new Node("D");
        Node node5 = new Node("E");
        
        //hacemos sus conexiones 
        node1.addNeighbour(node2);
        node2.addNeighbour(node3);
        node2.addNeighbour(node5);
        node3.addNeighbour(node4);
        
        //pasamos el nodo objetivo
        Algorithm algorithm = new Algorithm(node5);
        //pasamos el nodo origen 
        algorithm.runDeepeningSearch(node1);
    }
}
