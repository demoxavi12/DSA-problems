class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int lowerB=-1;
        int upperB=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){

            lowerB=mid;
            high = mid-1;
            }
            else if(nums[mid]>target)high = mid-1;
            else low = mid+1;
        }
        if(lowerB==-1){
            return new int[]{-1,-1};
        }
          low=0;
         high=nums.length-1;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
            upperB=mid;
            low = mid+1;

            }
            else if(nums[mid]>target)high = mid-1;
            else low = mid+1;
        }
        
        return new int[]{lowerB,upperB};
        
    }
}