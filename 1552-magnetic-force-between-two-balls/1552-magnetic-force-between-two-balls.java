class Solution {
    
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n= position.length;

        int low = 1;
        int high = position[n-1]-position[0];

        while(low<=high){
            int mid = (low+high)/2;
            int LastBall= position[0];
            int NoofBalls=1;
            for(int i=0;i<position.length;i++){
                if(position[i]-LastBall >= mid){
                    NoofBalls++;
                    LastBall=position[i];
                }
            }
            if(NoofBalls >= m){
                
                low =mid+1;
            }else{
                high =mid-1;
            }
        }
        return high;
    }
}