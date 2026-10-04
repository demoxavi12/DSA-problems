class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxi=0;
        
        Deque<Integer> st = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
             int element = st.pop();
             int nse=i;
             int pse=(st.isEmpty()?-1:st.peek());
             maxi = Math.max(maxi,heights[element]*(nse-pse-1));
            }
            st.push(i);
        }
         while(!st.isEmpty()){
             int element = st.pop();
             int nse=n;
             int pse=(st.isEmpty()?-1:st.peek());
             maxi = Math.max(maxi,heights[element]*(nse-pse-1));
            }

    return maxi;
    }
}