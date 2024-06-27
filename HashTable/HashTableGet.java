package HashTable;

public class HashTableGet {
    
    private int size = 7;
    private Node[] dataMap;

    class Node{
        String key;
        int value;
        Node next;

        public Node(String key, int value){
            this.key =  key;
            this.value = value;
        }

    }

    public HashTableGet(){
        //constructor code for class
        dataMap = new Node[size];
    }

    public Node[] getDataMap(){
        return dataMap;
    }

    public void printTable(){
        for(int i=0; i< dataMap.length; i++){
            System.out.println(i+ ":");
            Node temp = dataMap[i];
            while (temp!=null) {
                System.out.println("{"+temp.key+"="+temp.value+"}");
                temp = temp.next;
            }
        }
    }
    
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i = 0; i<keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    
    //get Method
    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp!=null){
            if(temp.key == key) return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        
        HashTableGet htg = new HashTableGet();
        htg.set("nails", 100);
        htg.set("tile", 50);
        htg.set("lumber", 80);

        System.out.println("Lumber:");
        System.out.println( htg.get("lumber") );

        System.out.println("\nBolts:");
        System.out.println( htg.get("bolts") );

        /*
            EXPECTED OUTPUT:
            ----------------
            Lumber:
            80

            Bolts:
            0

        */

        
    }
    
}
