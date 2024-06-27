package Trees;

public class InsertintoBST {
     
    Node root;

    //Node class Constructor
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public Node getRoot(){
        return root;
    }

    //insert Method
    public boolean insert(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if(newNode.value == temp.value) return false;
            if(newNode.value < temp.value){ //move left side in BST
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left; //this executes if temp value is not pointing to null in left side
            }
            if(newNode.value > temp.value){  //Move right side in  BST
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right; //this executes if temp value is not pointing to null in right side
            }
        }

    }


    //main method

    public static void main(String[] args) {
        InsertintoBST myBST = new InsertintoBST();

        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);

        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */


        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */
       

      
    }



}
