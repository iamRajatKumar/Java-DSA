package HashTable;

public class HashTableSet {
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

    public HashTableSet(){ //constructor code
        dataMap = new Node[size];
    }

    public Node[] getDataMap(){
        return dataMap;
    }

    public void printTable(){
        for(int i = 0; i < dataMap.length; i++){
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("{" + temp.key + "=" +temp.value +"}");
                temp = temp.next;
            }
        }
        
    }

    //Hash Method for Table 
    private int hash(String key){
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for(int i=0; i<keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
            // we are using 23 a prime no for multiplication 
            // if we use a prime no we will get a no which is more Random for Hash table
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

    public static void main(String[] args) {
        HashTableSet hts = new HashTableSet();

        hts.set("nails", 100);
        hts.set("tile", 50);
        hts.set("lumber", 80);
        hts.set("bolts", 200);
        hts.set("screws", 140);

        hts.printTable();
        
        /*
            EXPECTED OUTPUT:
            ----------------
            0:
            1:
            2:
            3:
               {screws= 140}
            4:
               {bolts= 200}
            5:
            6:
               {nails= 100}
               {tile= 50}
               {lumber= 80}

        */
        
    }

}
