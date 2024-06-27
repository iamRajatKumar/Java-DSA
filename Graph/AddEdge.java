package Graph;

import java.util.HashMap;
import java.util.ArrayList;

public class AddEdge {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph(){
        System.out.println(adjList);
    }

    //Add vertex method
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    //Method to Add Edge / connection
    public boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        
        AddEdge gae = new AddEdge();

        //adding vertex and printing it
        gae.addVertex("A");
        gae.addVertex("B");
        System.out.println("Graph before addEdge():");
        gae.printGraph();

        //Adding Edge
        gae.addEdge("A","B");
        System.out.println("\nGraph after addEdge():");
        gae.printGraph();
    }


    
}
