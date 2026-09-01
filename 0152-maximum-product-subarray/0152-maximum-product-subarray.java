class Solution {
    public int maxProduct(int[] nums) {
        int res= nums[0];
        int maxProd= nums[0];
        int minProd = nums[0];
        int n = nums.length;
         
         for(int i=1;i<n;i++){
            int curr = nums[i];
            if(curr<0){
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(curr,curr*maxProd);
            minProd = Math.min(curr,curr*minProd);

            res= Math.max(res,maxProd);
         }
return res;
    }
}