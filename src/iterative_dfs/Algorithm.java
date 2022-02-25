
package iterative_dfs;

import java.util.Stack;

public class Algorithm {
    
    private Node targetNode;
    private boolean isTargetFound;
    
    public Algorithm(Node targetNode){
        this.targetNode= targetNode;
    }
    
    public void runDeepeningSearch(Node startNode){
        //profundidad o nivel al que vamos a llevar (bfs)
        int depth=0;
        //mientras no lo encontremos 
        while(!isTargetFound){
            System.out.println();
            dfs(startNode,depth);
            depth++;
        }
    }
//implementamos la funcionalidad de busqueda de  profundidad 
    private void dfs(Node startNode, int depth) {
        Stack<Node> stack = new Stack<>();
        startNode.setDepthLevel(0);
        stack.push(startNode);
        
        //mientras no este vacia 
        while(!stack.isEmpty()){
            Node actualNode= stack.pop();
            System.out.println(actualNode+" ");
            
            //es el nodo que estamos buscando 
            if(actualNode.getName().equals(this.targetNode.getName())){
                System.out.println("\nEl nodo ha sido encontrado");
                this.isTargetFound=true;
                return;         
            }
            
            if(actualNode.getDepthLevel()>= depth ){
                continue;
            }
            
            for(Node node : actualNode.getAdjacenciesList()){
                node.setDepthLevel(actualNode.getDepthLevel()+1);
                stack.push(node);
            }
        }
    }
}
