class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        int preProd=1;
        int suffProd=1;
        int n = nums.length;

        for(int i=0;i<nums.length;i++){
         if(preProd==0)preProd=1;
         if(suffProd==0)suffProd=1;

         preProd *= nums[i];
         suffProd *= nums[n-i-1];

         maxProd = Math.max(maxProd,Math.max(preProd,suffProd));
        }


    return maxProd;

    }
}