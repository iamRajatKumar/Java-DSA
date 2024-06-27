package HashTable;

import java.util.ArrayList;

public class HashTablekeys {
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

    public HashTablekeys(){ //constructor code
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

    //Keys method
    @SuppressWarnings("rawtypes")
    public ArrayList keys(){
        ArrayList<String> allkeys = new ArrayList<>();
        for(int i=0; i<dataMap.length; i++){
            Node temp = dataMap[i];
            while(temp != null){
                allkeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allkeys;
    }

    public static void main(String[] args) {
        HashTablekeys htk = new HashTablekeys();
        htk.set("paint", 20);
        htk.set("bolts", 40);
        htk.set("nails", 100);
        htk.set("tile", 50);
        htk.set("lumber", 80);

        System.out.println( htk.keys() );
        
    	/*
        	EXPECTED OUTPUT:
        	----------------
        	[paint, bolts, nails, tile, lumber]
    
    	*/        

    }

}
