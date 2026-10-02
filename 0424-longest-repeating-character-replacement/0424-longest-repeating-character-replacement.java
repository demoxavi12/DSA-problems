class Solution {
    public int characterReplacement(String s, int k) {
        int right =0;
        int left =0;
        int maxLen=0;
        int n= s.length();

        int hash[]= new int[26];
        int maxf=0;

        while(right<n){
            char Rch = s.charAt(right);
            hash[Rch-'A']++;
            maxf=Math.max(maxf,hash[Rch-'A']);
            if((right-left+1)-maxf >k){
                char Lch = s.charAt(left);
                hash[Lch-'A']--;
                left ++;
            }

           maxLen = Math.max(maxLen,right-left+1);
            
            right++;
        }
        return maxLen;
    }
}