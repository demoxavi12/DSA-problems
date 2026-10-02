class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n == 0 || m == 0 || n < m) {
            return "";
        }

        int hash[]= new int[256];
        int count=0;

        int minLen=Integer.MAX_VALUE;
        int sIndex=-1;

        for(int i=0;i<m;i++){
            hash[t.charAt(i)]++;
        }

        int right =0;
        int left=0;
        
        while(right<n){
            char ch = s.charAt(right);
            if(hash[ch]>0)count++;
            hash[ch]--;
            while(count==m){
                if((right-left+1)<minLen){
                    minLen=right-left+1;
                    sIndex=left;
                }
                char Lch = s.charAt(left);
                hash[Lch]++;
                if(hash[Lch]>0)count--;
                left++;
            }
            right++;

        }
        if (sIndex== -1){
            return "";
        }

        return s.substring(sIndex,sIndex+minLen);
        
    }
}