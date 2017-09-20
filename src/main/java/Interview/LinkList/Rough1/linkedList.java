package Interview.LinkList.Rough1;

//Finding if 2 linklist are identical
public class linkedList {

    node head;

    public static void main(String[] args) {

        linkedList l = new linkedList();

        l.addAt(12, 1);
//        l.addAt(11,1);
//        l.addAt(10,1);
//        l.addAt(9,1);
//        l.addAt(8,1);
//        l.addAt(7,1);
        l.addAt(13, 2);

        linkedList l2 = new linkedList();

        l2.addAt(13, 1);
//        l2.addAt(11,1);
//        l2.addAt(10,1);
//        l2.addAt(9,1);
//        l2.addAt(8,1);
//        l2.addAt(7,1);
        l2.addAt(14, 2);
        l.display();
        l2.display();

        if (checkIfLLAreCommon(l.head, l2.head)) {

            System.out.println("both are same");
        } else {
            System.out.println("not same");

        }


        linkedList l3 = new linkedList();

        l3.addAt(12, 1);
        l3.addAt(11, 1);
        l3.addAt(10, 1);
        l3.addAt(9, 1);
        l3.addAt(8, 1);
        l3.addAt(7, 1);
        l3.addAt(13, 7);

        l3.display();
        l3.reverse();
        l3.display();


    }

    public static boolean checkIfLLAreCommon(node n1, node n2) {

        if (n1 == null && n2 == null) return true;
        if (n1 != null && n2 == null) return false;
        if (n1 == null && n2 != null) return false;

        node curr1 = new node();
        node curr2 = new node();

        curr1 = n1;
        curr2 = n2;

        while (curr1 != null) {

            if (curr1.getData() != curr2.getData())
                return false;

            if (curr2.getNext() == null && curr1.getNext() != null)
                return false;

            if (curr1.getNext() == null && curr2.getNext() != null)
                return false;


            curr1 = curr1.getNext();
            curr2 = curr2.getNext();
        }

        return true;
    }


    public void addAt(int data, int pos) {

        node nw = new node(data);

        if (head == null) {
            head = nw;
            return;
        }
        node curr = new node();
        node tmp = new node();
        curr = head;
        while (curr != null) {

            if (pos == 1) {
                nw.setNext(head);
                head = nw;
                return;
            }

            if (--pos == 1) {

                if (curr.getNext() == null) {
                    curr.setNext(nw);
                    return;
                }

                tmp.setNext(curr.getNext());
                curr.setNext(nw);
                nw.setNext(tmp);
                return;
            }
            curr = curr.next;
        }

    }

    public void reverse() {

        if (head == null)
            return;

        node prev = new node();
        node curr = new node();
        node next = new node();

        curr = head;

        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void display() {

        if (head == null)
            return;

        node curr = new node();
        curr = head;

        while (curr != null) {
            System.out.print(curr.getData() + "\t");

            if (curr.getNext() == null) {
                System.out.println();
                return;
            }

            curr = curr.getNext();
        }
        System.out.println();
    }
}

class node {
    node next;
    int data;

    node() {
    }

    node(int data) {
        this.data = data;
        next = null;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}