class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[]= new int[n];
        int right[]= new int[n];

        Deque<Integer>st = new ArrayDeque<>();

        //previous smaller
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>= heights[i]){
                st.pop();
            }
            left[i]= (st.isEmpty()?-1:st.peek());
            st.push(i);
        }
        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            right[i]=(st.isEmpty()?n:st.peek());
            st.push(i);
        }
            int maxi=0;
            
            for(int i=0;i<n;i++){
                int height=heights[i];
                int width = right[i]-left[i]-1;
                int area= height*width;
                maxi = Math.max(maxi,area);
            }
            return maxi;
    }
}