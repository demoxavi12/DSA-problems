class Solution {
    public int lessthan(int []nums,int goal){
        if(goal<0)return 0;
        int left =0;
        int right =0;
        int count=0;
        int sum =0;
        int n=nums.length;
        
        while(right<n){
            sum += nums[right];
            while(sum>goal){
                sum -= nums[left];
                left++;
            }
            count += (right-left+1);
            right++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return lessthan(nums,goal)-lessthan(nums,goal-1);
    }
}