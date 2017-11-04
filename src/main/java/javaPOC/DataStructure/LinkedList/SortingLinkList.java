package javaPOC.DataStructure.LinkedList;

/**
 * Created by Arpan on 9/24/17.
 */
public class SortingLinkList {

    nod head;

    public static void main(String[] args) {
        SortingLinkList sll = new SortingLinkList();
        sll.add(12, 1);
        sll.add(13, 2);
        sll.add(14, 3);
        sll.add(11, 1);
        sll.display();
        sll.reverse();

        sll.display();


    }

    public void add(int data, int pos) {
        nod nw = new nod(data);
        nod curr = new nod();
        nod tmp = new nod();
        if (head == null) {
            head = nw;
            return;
        }

        curr = head;

        while (curr != null) {

            if (pos == 1) {
                nw.setNext(head);
                head = nw;
                return;
            }

            if (curr.getNext() == null && (--pos == 1)) {
                curr.setNext(nw);
                return;
            }

            if (--pos == 1) {
                tmp = curr.getNext();
                curr.setNext(nw);
                nw.setNext(tmp);
                return;
            }

            curr = curr.getNext();
        }
    }

    public void remove(int pos) {

    }

    public void display() {
        if (head == null) {
            return;
        }

        nod curr = new nod();
        curr = head;
        System.out.println();

        while (curr != null) {
            System.out.print(curr.getData() + "\t");
            curr = curr.getNext();
        }

        System.out.println();
    }

    public void reverse() {

        nod prev = new nod();
        nod curr = new nod();
        nod next = new nod();

        curr = head;
        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void sort() {
        nod curr = new nod();
        nod curr1 = new nod();

        curr = head;
        curr1 = head.getNext();
        int lenLinkList = getLengthLinkList(curr);

        while( curr != null){

            while(curr1 != null){

                if(curr.getData() > curr1.getData()){

                }
                curr1 = curr1.getNext();
            }

            curr = curr.getNext();
        }

    }

    private int getLengthLinkList(nod curr) {

        int len = 0;

        if(head == null)
             len = 0;

        nod tmp = new nod();
        tmp = curr;

        while(tmp != null)
        {
            ++len;
            tmp = tmp.getNext();
        }

        return len;
    }
}


class nod {
    nod next;
    int data;

    nod() {}

    nod(int data) {
        this.data = data;
    }

    public nod getNext() {
        return next;
    }

    public void setNext(nod next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}