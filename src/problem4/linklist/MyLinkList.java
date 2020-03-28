package problem4.linklist;

public class MyLinkList {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = last = node;
            return;
        }
        last.setNext(node);
        last = node;
    }

    public void deleteFirst() {
        if (first == null) {
            first = last = null;
            return;
        }
        var second = first.getNext();
        first.setNext(null);
        first = second;
    }
}
