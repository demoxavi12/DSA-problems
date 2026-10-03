class Solution {
    public boolean isValid(String str) {
       Stack<Character>st= new Stack<>();
       int n=str.length();
       for(int i=0;i<n;i++){
        char top= str.charAt(i);
        if(top=='(' || top=='{' || top=='['){
            st.push(top);
        }
        else{
            if(st.isEmpty()){
                return false;
            }
            char ch = st.peek();
            if(ch=='('&& top ==')' || ch=='{'&& top =='}' || ch=='['&& top ==']'){
                st.pop();
            }else{
                return false;
            }
        }
       }
       return st.isEmpty();
    }
}