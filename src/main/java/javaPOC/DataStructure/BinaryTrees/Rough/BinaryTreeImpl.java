package javaPOC.DataStructure.BinaryTrees.Rough;

/**
 * Created by Arpan on 9/17/17.
 */
public class BinaryTreeImpl {

    node head;

    public void add(int i){

        node tmp = new node(i);

        if(head == null)
        {
            head = tmp;
            return;
        }

        node parent = head;

        while(true){
            if( i < parent.i){

                if(parent.l == null){
                    parent.l = tmp;
                    parent = parent.l;
                    return;
                }

                parent = parent.l;

            }

            if( i > parent.i){

                if(parent.r == null){
                    parent.r = tmp;
                    parent = parent.r;
                    return;
                }

                parent = parent.r;

            }
        }

    }

    public void inOrderTraverseTree(node focusNode) {
        if (focusNode != null) {
            // Traverse the left node
            inOrderTraverseTree(focusNode.l);
            // Visit the currently focused on node
            System.out.print(focusNode.i + "\t");
            // Traverse the right node
            inOrderTraverseTree(focusNode.r);
        }
    }

    public void preorderTraverseTree(node focusNode) {
        if (focusNode != null) {
            System.out.print(focusNode.i + "\t");
            preorderTraverseTree(focusNode.l);
            preorderTraverseTree(focusNode.r);
        }
    }

    public void postOrderTraverseTree(node focusNode) {
        if (focusNode != null) {
            preorderTraverseTree(focusNode.l);
            preorderTraverseTree(focusNode.r);
            System.out.print(focusNode.i + "\t");
        }
    }

    public static void main(String[] args) {
        BinaryTreeImpl b = new BinaryTreeImpl();
        b.add(20);
        b.add(10);
        b.add(30);
        b.add(8);
        b.add(15);
        b.add(25);
        b.add(35);

        b.inOrderTraverseTree(b.head);

    }
}


class node{
    int i ;
    node l;
    node r;

    node(){}

    node(int i){
        this.i = i;
        l = null;
        r = null;
    }
}