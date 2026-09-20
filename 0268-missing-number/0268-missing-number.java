class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int m=n+1;
        int sum = (n+1)*n/2;
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1 += nums[i];
        }
        return sum-sum1;
    }
}