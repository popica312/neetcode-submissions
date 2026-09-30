class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num: nums)
            hs.add(num);
        int longest = 0;

        for (int num: hs) {
            if (!hs.contains(num - 1)) {
                int length = 1;
                while (hs.contains(num + length))
                    length++;
                
                longest = Integer.max(length, longest);
            }
        }

        return longest;
    }
}
