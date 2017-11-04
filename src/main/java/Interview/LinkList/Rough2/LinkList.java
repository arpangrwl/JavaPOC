package Interview.LinkList.Rough2;

/**
 * Link List implimentation
 */
public class LinkList {

    node head;

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.add(12, 1);
        ll.add(13, 2);
        ll.add(14, 3);
        ll.add(15, 4);
        ll.display();
        ll.remove(4);
        ll.display();
        ll.remove(1);
        ll.display();
        ll.remove(1);
        ll.display();

    }

    public void add(int data, int pos) {

        node newNode = new node(data);
        node curr = new node();
        node tmp = new node();

        if (head == null) {
            head = newNode;
            return;
        }

        curr = head;

        while (curr != null) {

            if (pos == 1) {
                newNode.setNext(curr);
                head = newNode;
                return;
            }

            if (--pos == 1) {

                if (curr.next == null) {
                    curr.setNext(newNode);
                    return;
                }

                tmp = curr.getNext();
                newNode.setNext(tmp);
                curr.setNext(newNode);
                return;
            }
            curr = curr.getNext();
        }

    }

    public void display() {

        if (head == null)
            return;

        node curr = new node();
        curr = head;
        System.out.println();
        while (curr != null) {

            System.out.print(curr.getData() + "\t");

            curr = curr.getNext();
        }
    }

    public void remove(int pos) {

        node curr = new node();
        node tmp = new node();
        if (head == null) {
            return;
        }

        curr = head;

        while (curr != null) {

            if (pos == 1) {
                head = head.getNext();
                return;
            }

            if (--pos == 1) {
                tmp = curr.getNext();
                curr.setNext(tmp.getNext());
                return;
            }

            curr = curr.getNext();
        }


    }

    public void reverse() {

    }

}


class node {

    int data;
    node next;

    public node() {

    }

    public node(int data) {
        this.data = data;
        this.next = null;
    }

    public node(int data, node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }


}
