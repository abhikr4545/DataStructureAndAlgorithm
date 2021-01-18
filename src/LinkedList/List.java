package LinkedList;

public class List {

    private Node head;
    private Node tail;

    public void addToList(int data) {
        Node node = new Node(data);
        if(head==null) {
            node.setNext(null);
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
    }

    public void addToFront(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    public void addToBack(int data) {
        Node node = new Node(data);
        tail.setNext(node);
        tail = node;
    }

    public void printList() {
        Node current = head;
        while(current!=null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}
