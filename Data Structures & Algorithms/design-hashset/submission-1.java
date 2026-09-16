// boolean approach

class MyHashSet {

    boolean[] set;
    public MyHashSet() {
        set = new boolean[100000000];
    }
    
    public void add(int key) {
        if (!set[key])
            set[key] = true;
    }
    
    public void remove(int key) {
        set[key] = false;
    }
    
    public boolean contains(int key) {
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */