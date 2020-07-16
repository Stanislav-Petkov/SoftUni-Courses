package scale;

public class Scale<T> {

    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        if (this.left.equals(this.right)) {
            return null;
        }
        return null;
    }
}













