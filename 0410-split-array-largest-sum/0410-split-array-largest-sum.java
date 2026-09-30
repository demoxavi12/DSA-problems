class Solution {
    public boolean allocation(int []nums,int mid,int k ){
        int allocatedStu=1;
        int pages =0;
        for(int i=0;i<nums.length;i++){
           if(pages + nums[i]<=mid){
            pages += nums[i];
           }else{
            allocatedStu += 1;
            pages = nums[i];
           }
            
        }
        return allocatedStu<=k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low=nums[0];
        int high =0;
        for(int i=0;i<n;i++){
            low = Math.max(nums[i],low);
            high += nums[i];
        }
        if(k==1){
            return high;
        }

        while(low<=high){

            int mid = (low+high)/2;

            if(allocation(nums,mid,k)){
                high = mid-1;
            }else{
                low = mid+1;
            }

            
        }
        return low;
    }
}