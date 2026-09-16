class Solution {
    public String reverseWords(String s) {
        int n= s.length();
        StringBuilder res = new StringBuilder();
        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0)break;
            int end=i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            String word = s.substring(i+1,end+1);
            if(res.length()>0){
                res.append(' ');
            }
            res.append(word);
        }
        return res.toString();
    }
}