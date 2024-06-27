package Heap;

import java.util.ArrayList;
import java.util.List;

public class HeapInsert {
  
    private List<Integer> heap;

    public HeapInsert() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }

    @SuppressWarnings("unused")
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    @SuppressWarnings("unused")
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value){
        heap.add(value);
        int current = heap.size() -1;
        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public static void main(String[] args) {
        
        HeapInsert myHeap = new HeapInsert();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());


        myHeap.insert(100);

        System.out.println(myHeap.getHeap());


        myHeap.insert(75);

        System.out.println(myHeap.getHeap());

        /*
            EXPECTED OUTPUT:
            ----------------
            [99, 72, 61, 58]
            [100, 99, 61, 58, 72]
            [100, 99, 75, 58, 72, 61]

        */
    }
}
