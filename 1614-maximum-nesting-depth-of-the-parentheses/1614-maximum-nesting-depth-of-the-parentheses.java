class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int p=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                p++;
            }else if(ch==')'){
                p--;
            }
            if(p>ans){
                ans=p;
            }
        }
        return ans;
    }
}