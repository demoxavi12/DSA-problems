class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        long total = 0;
        for(int pile : piles){
            total += pile;
            right = Math.max(right, pile);
        }
        left = (int) ((total - 1) / h) + 1;
        right = (int) ((total - piles.length) / (h - piles.length + 1)) + 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            int hours = 0;
            for(int pile : piles){
                hours += Math.ceil((double)pile / mid);
            }
            if(hours <= h){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return right;
    }
}