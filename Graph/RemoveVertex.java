package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveVertex {
    
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph(){
        System.out.println(adjList);
    }

    // add vertex
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    //addedge
    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    //removing an Edge from the vertex
    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null &&  adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    //Removing vertex in a graph
    public boolean removeVertex(String vertex){
        if( adjList.get(vertex) ==  null) return false;
        for(String otherVertex : adjList.get(vertex)){
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

    public static void main(String[] args) {
        
        RemoveVertex rVertex = new RemoveVertex();
        
        rVertex.addVertex("A");
        rVertex.addVertex("B");
        rVertex.addVertex("C");
        rVertex.addVertex("D");

        rVertex.addEdge("A", "B");
        rVertex.addEdge("A", "C");
        rVertex.addEdge("A", "D");
        rVertex.addEdge("B", "D");
        rVertex.addEdge("C", "D");


        System.out.println("Graph before removeVertex():");
        rVertex.printGraph();

        rVertex.removeVertex("D");

        System.out.println("\nGraph after removeVertex():");
        rVertex.printGraph();
        
        /*
            EXPECTED OUTPUT:
            ----------------
            Graph before removeVertex():
            {A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}
            
            Graph after removeVertex():
            {A=[B, C], B=[A], C=[A]}

        */
    }

}

