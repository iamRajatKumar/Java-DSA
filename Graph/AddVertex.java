package Graph;

import java.util.ArrayList;
import java.util.HashMap;


public class AddVertex {
    
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    
    // HashMap contains Key value pair Like this
    // HashMap<key, Value>
    // Here in Graph Key is of String Type and Value is also Array Of String
    // Ex: A = ["Rajat","Sharma"] So A is key and 
    //Value is Array of String in List i.e. "Rajat" & "Sharma"

    //Print Method
    public void printGraph(){
        System.out.println(adjList);
    }

    //Adding  a vertex in graph code
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    //Main method
    public static void main(String[] args) {
        AddVertex gav =new AddVertex();
        gav.addVertex("A");
        gav.addVertex("B");
        gav.printGraph();
    }

}
