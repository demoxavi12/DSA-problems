
import java.util.Arrays;

class Solution {
    public int sum(int value) {
        int sum = 0;

        while (value > 0) {
            sum += value % 10;
            value /= 10;
        }

        return sum;
    }

    public int minSwaps(int[] nums) {
        int n = nums.length;

        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> {
            int sumA = sum(nums[a]);
            int sumB = sum(nums[b]);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return Integer.compare(nums[a], nums[b]);
        });

        int[] targetPos = new int[n];

        for (int pos = 0; pos < n; pos++) {
            targetPos[indices[pos]] = pos;
        }

        boolean[] visited = new boolean[n];
        int cycles = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            cycles++;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = targetPos[j];
            }
        }

        return n - cycles;
    }
}
