class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        int ans[][]= new int[n][2];
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int index=0;
        for(int i=0;i<n;i++){
            if(index==0 || ans[index-1][1]<arr[i][0]){
                ans[index][0]=arr[i][0];
                ans[index][1]=arr[i][1];
                index++;
            }else{
                ans[index-1][1]=Math.max(ans[index-1][1],arr[i][1]);
            }
        }

         return Arrays.copyOf(ans, index);
    }
}