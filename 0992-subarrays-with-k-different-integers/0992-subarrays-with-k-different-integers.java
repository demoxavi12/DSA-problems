class Solution {
    public int subarraysWithLKDistinct(int nums[],int k){
        if(k<0)return 0;

        int left=0;
        int right=0;

        int n = nums.length;
        int count=0;
        
        HashMap<Integer,Integer> map = new HashMap<>();

        while(right<n){
            int Rnum= nums[right];
            map.put(Rnum,map.getOrDefault(Rnum,0)+1);
            while(map.size() > k){
                int Lnum=nums[left];
                map.put(Lnum,map.getOrDefault(Lnum,0)-1);
                if(map.get(Lnum)==0){
                    map.remove(Lnum);
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