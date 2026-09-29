class Solution {

    public boolean isValidAns(int[] position,int minDistance,int m){
        int pos=position[0];
        int ballNum=1;

        for(int i=1;i<position.length;i++){
          if((position[i]-pos)>=minDistance){
             ballNum++;
            pos=position[i];

            if(ballNum==m){
                return true;
            }
          }

        }
          return false;
    }
    public int maxDistance(int[] position, int m) {
        int start=0;
        int n=position.length;

        Arrays.sort(position);

       int end=position[n-1]-position[0];
       int ans=-1;


       while(start<=end){
        int mid=start+(end-start)/2;
       
       if(isValidAns(position,mid,m)){
        ans=mid;
        start=mid+1;
       }
       else{
        end=mid-1;
       }

       }
       return ans;
    }
}