class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();

        int hash[]= new int[256];
        Arrays.fill(hash,-1);

        int maxLen=0;
        int left=0;
        int right=0;
        while(right<n){
            if(hash[s.charAt(right)] != -1){
                left = Math.max(left,hash[s.charAt(right)]+1);

            }
            int len= right-left+1;
            if(len>maxLen){
                maxLen=len;
            }
            hash[s.charAt(right)]=right;
            right++;
        }
        return maxLen;

    }
}