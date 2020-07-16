package DoublyLinkedListTask2;

import implementations.DoublyLinkedList;
import implementations.Queue;

public class Main2 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> nums = new DoublyLinkedList<>();
        nums.addFirst(11);
        nums.addFirst(12);
        nums.addFirst(13);
        nums.removeFirst();
    }
}
