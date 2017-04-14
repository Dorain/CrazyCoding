public class RandomizedSet {
    HashMap<Integer, Integer> locs;
    ArrayList<Integer> list;
    Random rand;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        locs = new HashMap<Integer, Integer>();
        list = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(locs.containsKey(val)) return false;
        list.add(val);
        locs.put(val,list.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!locs.containsKey(val)) return false;
        // swap with the last item, to keep track the list with map
        int lastVal = list.get(list.size()-1);
        int valIdx = locs.get(val);
        list.set(valIdx, lastVal);
        list.remove(list.size()-1);
        locs.put(lastVal, valIdx);
        locs.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */