class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int hash[]= new int[3];
        for(int i=0;i<3;i++){
            hash[i]=-1;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']=i;
            if(hash[0] != -1 && hash[1] != -1 && hash[2] != -1){
                count += (1+ Math.min(hash[0],Math.min(hash[1],hash[2])));
            }
        }
        return count;
    }
}