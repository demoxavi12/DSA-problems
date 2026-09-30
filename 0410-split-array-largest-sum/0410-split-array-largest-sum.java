class Solution {

    public int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (calGroups(nums, mid) <= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    int calGroups(int[] nums, int mid) {

        int sum = 0;
        int count = 1;

        for (int num : nums) {

            if (sum + num <= mid) {
                sum += num;
            } else {
                count++;
                sum = num;
            }
        }

        return count;
    }
}