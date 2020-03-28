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
    }
