class Solution {
    public int minOperations(int[] nums, int x) {

        int total = 0;

        // Find total sum
        for (int num : nums) {
            total += num;
        }

        // We need to keep a subarray with this sum
        int target = total - x;

        // If target is negative, impossible
        if (target < 0) {
            return -1;
        }

        // If target is 0, remove everything
        if (target == 0) {
            return nums.length;
        }

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        // Sliding window
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // If sum becomes too large,
            // move left forward
            while (sum > target) {
                sum -= nums[left];
                left++;
            }

            // Found a subarray with required sum
            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        // No valid subarray found
        if (maxLength == -1) {
            return -1;
        }

        // Elements outside the subarray are removed
        return nums.length - maxLength;
    }
}