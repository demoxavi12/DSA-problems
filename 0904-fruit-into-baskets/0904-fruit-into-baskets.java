class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        int maxLen=0;
        int n = fruits.length;

        while(right<n){
            int Cfruit = fruits[right];
            

            map.put(Cfruit,map.getOrDefault(Cfruit,0)+1);

            
                if(map.size()>2){
                    
                    int Bfruit = fruits[left];
                    map.put(Bfruit,map.getOrDefault(Bfruit,0)-1);
                    if(map.get(Bfruit)==0){
                        map.remove(Bfruit);
                    }
                    left++;
                }
            
            
            if(map.size() <= 2){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
        }
        return maxLen;
    }
}