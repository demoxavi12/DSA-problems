class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;

        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                
            for(int i=right;i>=left;i--){
                list.add(arr[bottom][i]);
            }
            bottom--;
            }
             if(left<=right){
                
            for(int i=bottom;i>=top;i--){
                list.add(arr[i][left]);
            }
            left++;
            }
            
        }
        return list;
    }
}