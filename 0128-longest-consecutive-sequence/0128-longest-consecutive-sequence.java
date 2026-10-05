class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // num is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int x = num;
                int count = 1;

                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}