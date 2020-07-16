public class Deque {
    private Integer[] elements;
    private int size;
    private int head;
    private int tail;

    public Deque() {
        this.elements = new Integer[5];
        this.head = this.elements.length / 2;
        this.tail = this.elements.length / 2;
    }

    public void push(Integer element) {
        if (this.elements[this.head] == null) {
            this.elements[this.head] = element;
        } else {
            if (this.head == 0) {
                this.elements = grow();
            }
            this.elements[--this.head] = element;
        }
        this.size++;
    }

    public void offer(Integer element) {
        if (this.elements[this.tail] == null) {
            this.elements[this.tail] = element;
        } else {
            if (this.tail == this.elements.length - 1) {
                this.elements = grow();
            }
            this.elements[++this.tail] = element;
        }
        this.size++;
    }

    private Integer[] grow() {
        Integer[] numbers = new Integer[this.elements.length * 3];
        System.arraycopy(this.elements, this.head,
                numbers, numbers.length / 4, this.size);

        this.head = numbers.length / 4;
        this.tail = this.head + size - 1;
        return numbers;
    }

    public int poll() {
        return this.removeFirst();
    }

    public int removeFirst() {
        if (this.elements[this.head] == null) {

            throw new IndexOutOfBoundsException();
        }
        Integer element = this.elements[this.head];
        this.elements[this.head++] = null;
        this.size--;
        return element;
    }

    public int pop() {
        return this.removeFirst();
    }

    public int peek() {
        if (this.elements[this.head] == null) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[this.head];
    }
}

