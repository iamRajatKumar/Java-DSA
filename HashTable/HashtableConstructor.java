package HashTable;

public class HashtableConstructor {
    private int size = 7;
    private Node[] dataMap;
    
    class Node{
        String key;
        int value;
        Node next;

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public HashtableConstructor(){
        dataMap = new Node[size];
    }

    //For Printing Hash Table
    public void printTable(){
        for(int i = 0; i < dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" +temp.key + "=" +temp.value + "}");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
       HashtableConstructor htc = new HashtableConstructor();
       htc.printTable(); 
    }
}
