package Interview.LinkList.Rough;

class Node<E> {
    private Node next;
    private E element;

    Node() {
    }

    Node(Node n, E e) {
        next = n;
        element = e;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}

public class linkedList<E> {

    static int count;
    Node<E> head;

    public static int incrementCount() {
        return ++count;
    }

    public static int decrementCount() {
        return --count;
    }

    public void addFirst(E element) {
        Node<E> val = new Node<E>(null, element);
        if (head == null) {
            head = val;
            incrementCount();
            return;
        }
        val.setNext(head);
        head = val;
        incrementCount();

    }

    public void addLast(E element) {
        Node<E> tmp = new Node<E>(null, element);

        if(head == null)
        {
            head = tmp;
            incrementCount();
            return;
        }

        Node<E> Current = new Node<E>();
        Current = head;

        while(Current.getNext() != null){
            Current = Current.getNext();
        }

        Current.setNext(tmp);
        incrementCount();

    }

    public void addAt(E element, int position) {
        Node<E> val = new Node<E>(null, element);
        Node<E> tmp = new Node<E>();
        Node<E> current = new Node<E>();

        if(position <= 0){
            return;
        }

        current = head;

        while(current.getNext() != null && position > 0 ){

            if(position == 1) {
                val.setNext(current);
                head = val;
                return;
            }

            if(--position == 1)
            {
                tmp = current.getNext();
                current.setNext(val);
                val.setNext(tmp);
                return;
            }
            current = current.getNext();
        }

    }


    public void deleteAt(int pos ){

        if(head == null )
            return ;

        Node curr = new Node();
        Node tmp = new Node();

        curr = head;
        while(curr != null)
        {
            if(pos == 1)
            {
                curr = curr.getNext();
                head = curr;
                return;
            }

            if(--pos == 1 ){
                tmp = curr.getNext().getNext();
                curr.setNext(tmp);
                return;
            }

            curr = curr.getNext();

        }

    }

    public void reverseLinkList(){

        boolean flag = true;
        if(head == null)
            return;

        Node Prev = new Node();
        Node Curr = new Node();
        Node Next = new Node();

        Curr = head;

        while (Curr !=null)
        {
            Next = Curr.getNext();
            Curr.setNext(Prev);
            Prev = Curr;
            Curr = Next;
        }
        head = Prev;
    }

    public E middleElement(){

        Node curr = new Node();
        Node dCurr = new Node();

        curr = head;
        dCurr = head;

        while(dCurr.getNext() != null )
        {
            try {
                if(dCurr.getNext().getNext() == null)
                    break;
            }catch (NullPointerException n)
            {
                break;
            }


            dCurr = dCurr.getNext().getNext();
            curr = curr.getNext();
        }

        return (E) curr.getElement();
    }

    public String checkPalandrom(){

        return null;
    }

    public void display() {
        if (head == null)
            return;
        Node<E> tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getElement() + "\t");
            tmp = tmp.getNext();
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}


class mainClass {

    public static void main(String[] args) {
        linkedList<String> l = new linkedList<String>();
        l.addFirst("Arpan");
        l.display();
        l.addFirst("Nipun");
        l.display();
        l.addLast("A");
        l.addLast("B");
        l.addLast("C");
        l.display();

        l.addLast("D");
        l.addLast("E");
        l.addLast("F");
        l.addLast("G");
        l.addLast("H");
        l.display();

        System.out.println(l.middleElement());

    }
}


