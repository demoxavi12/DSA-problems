class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n = arr1.length;
        int m = arr2.length;

        int ans=0;

        for(int i=0;i<n;i++){
            boolean valid = true; 
            int num=arr1[i];
            for(int j=0;j<m;j++){
                int sub = Math.abs(num-arr2[j]);
                if(sub<=d){
                    valid=false;
                    break;
                }
            }
                if(valid){
                    ans++;
                }
        }
            return ans;
    }
}