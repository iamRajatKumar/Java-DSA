package Trees;

public class InsertANodeinBST {
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
            else{  //Move right side in  BST
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
        InsertANodeinBST myBST = new InsertANodeinBST();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(27);

       
        System.out.println(myBST.root.left.right.value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2

            Root->Left: 1

            Root->Right: 3

        */
       

      
    }



}
