class RandomizedSet {
private Map<Integer, Integer> valToIndex;
    private List<Integer> nums;
    private Random rand;

    public RandomizedSet() {
        valToIndex = new HashMap<>();
        nums = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (valToIndex.containsKey(val)) {
            return false;
        }
        nums.add(val);
        valToIndex.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!valToIndex.containsKey(val)) {
            return false;
        }
        int index = valToIndex.get(val);
        int lastElement = nums.get(nums.size() - 1);

        nums.set(index, lastElement);
        valToIndex.put(lastElement, index);

        nums.remove(nums.size() - 1);
        valToIndex.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}