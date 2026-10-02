class Solution {
    public int characterReplacement(String s, int k) {
        int right =0;
        int left =0;
        int maxLen=0;
        int n= s.length();

        HashMap<Character,Integer> map = new HashMap<>();
        int maxf=0;

        while(right<n){
            char Rch = s.charAt(right);
            
            map.put(Rch,map.getOrDefault(Rch,0)+1);
             maxf=Math.max(maxf,map.get(Rch));
            if((right-left+1)-maxf >k){
                char Lch = s.charAt(left);
                map.put(Lch,map.getOrDefault(Lch,0)-1);
                left ++;
            }

           maxLen = Math.max(maxLen,right-left+1);
            
            right++;
        }
        return maxLen;
    }
}