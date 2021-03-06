
//klasa koito pravi spisuci koito durjat Nodove . tova ima v edin Node:
/////////////
//  key    //
//  value  //
//  next   //
/////////////


import java.util.Iterator;

public class NodeList<Key, Val> implements Iterable<Node<Key, Val>> {

    private Node<Key, Val> firstElement;
    private int size = 0;

    public void add(Node<Key, Val> node) {
        size++;
        if (firstElement == null) {
            firstElement = node;
            return;
        }

        Node<Key, Val> currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.next == null) {
                currentNode.next = node;
                return;
            }
            currentNode = currentNode.next;
        }

    }

    public String toString() {
        if (firstElement == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        Node<Key, Val> curentNode = firstElement;
        while (curentNode != null) {
            sb.append("{");
            sb.append(curentNode.toString());
            sb.append("}");
            sb.append(",");
            curentNode = curentNode.next;
        }
        return sb.toString();
    }

    public Node<Key, Val> getFirstElementWithKey(Key key) {
        Node<Key, Val> currentNode = firstElement;

        while (currentNode != null) {
            if (key.equals(currentNode.key)) {/
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void overrideElementWithKey(Key key, Val value) {
        if (firstElement == null) {
            return;
        }
        Node<Key, Val> nodeToReplaceWith = new Node<>(key, value);
        if (key.equals(firstElement.key)) {
            nodeToReplaceWith.next = firstElement.next;
            firstElement = nodeToReplaceWith;
            return;
        }

        Node<Key, Val> currentNode = firstElement;
        while (currentNode != null) {
            if (currentNode.next != null && currentNode.next.key.equals(key)) {
                nodeToReplaceWith.next = currentNode.next.next;
                currentNode.next = nodeToReplaceWith;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public Iterator<Node<Key, Val>> iterator() {
        return new NodeListIterator(firstElement);
    }

    public class NodeListIterator implements Iterator<Node<Key, Val>> {
        Node<Key, Val> nextElement;

        NodeListIterator(Node<Key, Val> nextElement) {
            this.nextElement = nextElement;
        }

        @Override
        public boolean hasNext() {
            return this.nextElement != null;
        }

        @Override
        public Node<Key, Val> next() {
            Node<Key, Val> nodeToReturn = this.nextElement;
            this.nextElement = this.nextElement.next;
            return nodeToReturn;
        }
    }
}

