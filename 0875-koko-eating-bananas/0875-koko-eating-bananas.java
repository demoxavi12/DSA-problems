class Solution {
    public int max(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
    public boolean CanFinish(int []arr,int hour,int h){
        int totalH=0;
        for(int i=0;i<arr.length;i++){
           totalH += (arr[i] + hour - 1) / hour;
           if(totalH>h){
            return false;
           }
        }
           return totalH<=h;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high=max(piles);
        int low=1;
        int ans=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(CanFinish(piles,mid,h)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}