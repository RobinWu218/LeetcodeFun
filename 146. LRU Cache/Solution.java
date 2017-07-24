public class LRUCache {
    LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer,Integer> e){
                return this.size() > capacity;
            }
        };
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)){
            return -1;
        }
        return cache.get(key);
    }
    
    public void put(int key, int value) {
        Integer currentValue = cache.get(key);
        cache.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */