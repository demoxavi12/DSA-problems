class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
       int small=0;
       int targetCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                small++;
            }
            else if(nums[i]==target){
                targetCount++;
            }
        }
        for(int i=0;i<targetCount;i++){
            res.add(small++);
        }
        return res;
    }
}