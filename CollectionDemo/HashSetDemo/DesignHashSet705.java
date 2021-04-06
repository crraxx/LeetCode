package CollectionDemo.HashSetDemo;

public class DesignHashSet705 {

    boolean[] hashSet = null;

    /**
     * Initialize your data structure here.
     */
    public DesignHashSet705() {
        hashSet = new boolean[1000001];
    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return hashSet[key];
    }
}
