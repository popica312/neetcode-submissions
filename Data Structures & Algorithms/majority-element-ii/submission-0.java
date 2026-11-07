class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.computeIfPresent(n, (k, v) -> v + 1);
            }
            else if (map.size() < 2) {
                map.put(n, 1);
            }
            else {
                Integer[] keys = map.keySet().toArray(Integer[]::new);
                for (int key: keys) {
                    map.computeIfPresent(key, (k, v) -> v - 1);
                    if (map.get(key) == 0) {
                        map.remove(key);
                    }
                }
            }
        }

        Integer[] majority_elements = map.keySet().toArray(Integer[]::new);
        int n = majority_elements.length;
        int[] counts = new int[n];
        for (int num : nums) {
            for (int i = 0; i < n; i ++)
            if (majority_elements[i] == num)
                counts[i]++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i ++)
        if (counts[i] > nums.length / 3)
            ans.add(majority_elements[i]);
        
        return ans;
    }
}