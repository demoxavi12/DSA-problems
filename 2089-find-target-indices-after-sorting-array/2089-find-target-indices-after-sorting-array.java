class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
       int small=0;
       int targetCount=0;
        for(int num:nums){
            if(num<target){
                small++;
            }
            else if(num==target){
                targetCount++;
            }
        }
        for(int i=0;i<targetCount;i++){
            res.add(small++);
        }
        return res;
    }
}