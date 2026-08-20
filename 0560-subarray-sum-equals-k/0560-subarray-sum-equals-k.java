class Solution {
    public int subarraySum(int[] arr, int k) {
        int count=0;
        int sum=0;
        int n=arr.length;
        HashMap<Integer,Integer>map= new HashMap<>();
        map.put(0,1);

        for(int i=0;i<n;i++){
            sum += arr[i];
            int remove = sum-k;
            if(map.containsKey(remove)){
                count += map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }


        return count;
    }
}