class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [][]NumsI= new int[n][2];
        
        for(int i=0;i<n;i++){
            NumsI[i][0]=nums[i];
            NumsI[i][1]=i;
        }
        Arrays.sort(NumsI,(a,b)->Integer.compare(a[0],b[0]));
        int left=0;
        int right=n-1;
        while(left<right){
            int sum = NumsI[left][0]+ NumsI[right][0];
            if(sum==target){
                return new int[]{NumsI[left][1],NumsI[right][1]};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }

        }
        return new int[]{-1,-1};
    }
}