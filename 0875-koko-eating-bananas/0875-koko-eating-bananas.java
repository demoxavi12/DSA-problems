class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1, right = 1;

        long total = 0;

        for (int pile : piles) {
            total += pile;
            right = Math.max(right, pile);
        }

       left = (int) ((total + h - 1) / h);

        long a = total - piles.length;
        long b = h - piles.length + 1;

        right = (int) ((a / b) + 1);

        while (left < right) {

            int mid = left + (right - left) / 2;

            long hours = 0;

            for (int pile : piles) {
                hours += ((long) pile + mid - 1) / mid;

                if (hours > h) {
                    break;
                }
            }

            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}