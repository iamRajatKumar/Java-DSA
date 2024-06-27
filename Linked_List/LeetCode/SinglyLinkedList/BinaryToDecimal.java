package Linked_List.LeetCode.SinglyLinkedList;

public class BinaryToDecimal {
    
        private Node head;
        private int length;
    
        class Node {
            int value;
            Node next;
    
            Node(int value) {
                this.value = value;
            }
        }
    
        public BinaryToDecimal(int value) {
            Node newNode = new Node(value);
            head = newNode;
            length = 1;
        }
    
        public Node getHead() {
            return head;
        }
    
        public int getLength() {
            return length;
        }
    
        public void printList() {
            Node temp = head;
            if (temp == null) {
                System.out.println("empty");
            } else {
                while (temp != null) {
                    System.out.print(temp.value);
                    temp = temp.next;
                    if (temp != null) {
                        System.out.print(" -> ");
                    }
                }
                System.out.println();
            }
        }
        
        public void makeEmpty() {
            head = null;
            length = 0;
        }
        
        public void append(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            length++;
        }
        
        //   +===================================================+
        //   |               WRITE YOUR CODE HERE                |
        //   | Description:                                      |
        //   | - This method converts a binary number,           |
        //   |   represented as a linked list, to a decimal int. |
        //   |                                                   |
        //   | Return type: int                                  |
        //   | - Returns the decimal equivalent of the binary    |
        //   |   number.                                         |
        //   |                                                   |
        //   | Tips:                                             |
        //   | - We use a while loop to traverse the linked list.|
        //   | - Multiply the current sum by 2 and add the value |
        //   |   at each node to get the decimal number.         |
        //   +===================================================+
        public int binaryToDecimal(){
        int num = 0;
        Node current = head;
        // Traverse linked list
        while (current != null)
        {
            // Multiply result by 2 and add
            // head's data
            num = num * 2 + current.value;
            // Move next
            current = current.next;
        }
        return num;    
        }

        //main code
        public static void main(String[] args) {
            // ---------------
        // Convert 1011 to 11
        // ---------------
        BinaryToDecimal list1 = new BinaryToDecimal(1);
        list1.append(0);
        list1.append(1);
        list1.append(1);
        System.out.println("Convert 1011 to 11:");
        System.out.println("Input: 1 -> 0 -> 1 -> 1");
        System.out.println("Output: " + list1.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1100 to 12
        // ---------------
        BinaryToDecimal list2 = new BinaryToDecimal(1);
        list2.append(1);
        list2.append(0);
        list2.append(0);
        System.out.println("Convert 1100 to 12:");
        System.out.println("Input: 1 -> 1 -> 0 -> 0");
        System.out.println("Output: " + list2.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1 to 1
        // ---------------
        BinaryToDecimal list3 = new BinaryToDecimal(1);
        System.out.println("Convert 1 to 1:");
        System.out.println("Input: 1");
        System.out.println("Output: " + list3.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert empty list to 0
        // ---------------
        BinaryToDecimal list4 = new BinaryToDecimal(0);
        list4.makeEmpty();
        System.out.println("Convert empty list to 0:");
        System.out.println("Input: empty");
        System.out.println("Output: " + list4.binaryToDecimal());
        System.out.println("---------------");
        }
    
    }
