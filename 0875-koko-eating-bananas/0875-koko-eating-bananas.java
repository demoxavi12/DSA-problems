class Solution {
    public boolean CountHours(int []arr,int hour,int h){
        long totalH=0;
        for(int i:arr){
            totalH += (long)(i+hour-1)/hour;
            if(totalH>h){
                return false;
            }
        }
        return totalH <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = 1;
        int n=piles.length;
        long total=0;
    
        for(int pile:piles){
            total += pile;
            high = Math.max(high,pile);
        }
        low = (int)((total+h-1)/h);
        long a = total-n;
        long b = h-n+1;
        high = (int)((a/b)+1);
        while(low<=high){
            int mid = low + (high-low)/2;
            if(CountHours(piles,mid,h)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}