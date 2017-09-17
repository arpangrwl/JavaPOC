package Interview.LinkList.Rough;

/**
 * Created by Arpan on 9/16/17.
 */
class node<A> {
    A a;
    node prev;
    node next;

    public node() {
    }

    public node(A ele) {
        this.a = ele;
        this.prev = null;
        this.next = null;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public node getPrev() {
        return prev;
    }

    public void setPrev(node prev) {
        this.prev = prev;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }
}

public class DoubleLinkList<A> {

    node<A> head;

    public void addFirst(A ele){

        node tmp = new node();
        node<A> n = new node<>(ele);
        if(head == null){
            head = n;
            return;
        }

        tmp = head;

        n.setNext(tmp);
        tmp.setPrev(n);

        head = n ;
    }

    public void addLast(A ele){

        node<A> n = new node<>(ele);
        node<A> curr = new node<>(ele);
        if(head == null){
            head = n;
            return;
        }

        curr = head;

        while(curr.getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext(n);
        n.setPrev(curr);
    }

    public void addAt(A ele, int pos){

        node<A> n = new node<>(ele);
        node<A> tmp = new node<>();
        node<A> curr = new node<>();
        if(head == null){
            head = n;
            return;
        }

        curr = head;

        while(curr.getNext() != null){

            if(pos == 1)
            {
                n.setNext(head);
                head.setPrev(n);
                head = n;
                return;
            }

            if(--pos == 1)
            {
                tmp = curr.getNext();
                curr.setNext(n);
                n.setNext(tmp);
                n.setPrev(curr);
                tmp.setPrev(n);
                return ;
            }
            curr = curr.getNext();
        }
    }

    public void removeAt(int pos){

        node<A> tmp = new node<>();
        node<A> curr = new node<>();

        if(head == null){
            return;
        }
        curr = head;
        while(curr.getNext() != null){

            if(pos == 1)
            {
                head = curr.getNext();
                head.setPrev(null);
                return ;
            }



            if(--pos == 1){

                if(curr.getNext().getNext() == null)
                {
                    curr.setNext(null);
                    return;
                }

                tmp = curr.getNext().getNext();
                curr.setNext(tmp);
                tmp.setPrev(curr);
                return;
            }
            curr = curr.getNext();
        }
    }

    public void display(){

        node curr = new node();
        if(head == null)
            return;

        curr = head;
        while(curr != null)
        {
            System.out.print(curr.getA() + "\t");
            curr = curr.getNext();
        }
        System.out.println("\n");
    }

}


class MainDoubleLinkList{

    public static void main(String[] args) {

        DoubleLinkList<Integer> d = new DoubleLinkList();
        d.addFirst(16);
        d.addFirst(14);
        d.addFirst(13);
        d.display();
        d.addLast(17);
        d.addLast(18);
        d.addLast(19);
        d.display();
        d.addAt(10,1);
        d.addAt(9,1);
        d.display();
        d.addAt(11,3);
        d.addAt(12,4);
        d.addAt(15,7);
        d.display();

        d.removeAt(11);
        d.display();

    }
}