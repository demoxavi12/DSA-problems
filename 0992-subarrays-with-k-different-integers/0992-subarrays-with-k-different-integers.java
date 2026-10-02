class Solution {
    public int subarraysWithLKDistinct(int nums[],int k){
        if(k<0)return 0;

        int left=0;
        int right=0;

        int n = nums.length;
        int count=0;
        int distinct=0;
       int hash[]= new int[n+1];

        while(right<n){
            int Rnum= nums[right];
            if(hash[Rnum]==0){
                distinct++;
            }
            hash[Rnum]++;
            while(distinct > k){
                int Lnum=nums[left];
               hash[Lnum]--;
                if(hash[Lnum]==0){
                    distinct--;
                }
                left++;

            }
            count += right-left+1;
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarraysWithLKDistinct(nums,k)-subarraysWithLKDistinct(nums,k-1);
    }
}