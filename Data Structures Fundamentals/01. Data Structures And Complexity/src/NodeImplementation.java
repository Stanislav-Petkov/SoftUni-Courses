public class NodeImplementation {

    private static class Node {
        int element;
        Node next;
    }

    public static void main(String[] args) {
        Node first = new Node();
        first.element = 10;

        Node currentLast = first;

        for (int i = 1; i < 100; i++) {
            Node newNode = new Node();
            newNode.element = 10 + i;
            currentLast.next = newNode;
            currentLast = newNode;
        }
    }
}

