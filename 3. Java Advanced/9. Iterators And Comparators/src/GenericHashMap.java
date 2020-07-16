
public class GenericHashMap<Key, Val> {

    private static final int INITIAL_CAPACITY = 4;
    private static final double LOAD_FACTOR = 0.5;
    private int size;

    private NodeList[] buckets;

    GenericHashMap() {
        this.buckets = new NodeList[INITIAL_CAPACITY];
        this.size = 0;
    }

    public boolean contains(Key key) {
        Val value = this.get(key);
        if (value != null) {
            return true;
        }
        return false;
    }

    public void put(Key key, Val value) {

        resizeWhenNeeded();

        int bucketIdx = getBucketIndex(key);

        if (this.buckets[bucketIdx] == null) {
            this.buckets[bucketIdx] = new NodeList<Key, Val>();
        }

        NodeList<Key, Val> currentBucket = this.buckets[bucketIdx];
        Node<Key, Val> existing = currentBucket.getFirstElementWithKey(key);
        if (existing == null) {
            size++;
            Node<Key, Val> nodeToPut = new Node<Key, Val>(key, value);
            currentBucket.add(nodeToPut);
            return;
        }
        currentBucket.overrideElementWithKey(key, value);
    }

    private void resizeWhenNeeded() {

    }

    public int getSize() {
        return this.size;
    }

    public Val get(Key key) {
        int bucketIdx = getBucketIndex(key);
        NodeList<Key, Val> currentBucket = buckets[bucketIdx];
        if (currentBucket == null) {
            return null;
        }
        Node<Key, Val> node = currentBucket.getFirstElementWithKey(key);
        return node.value;
    }

    private int getBucketIndex(Key key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
}
