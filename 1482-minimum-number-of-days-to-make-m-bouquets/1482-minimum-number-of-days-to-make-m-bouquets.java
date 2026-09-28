class Solution {
    public boolean possible(int []arr,int day,int m,int k){
        int count =0;
        int noFb = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            if(count==k){
                noFb++;
                count =0;
            }
            }else{
                count=0;
            }
        }
        return noFb >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
         if ((long)m * k > n) {
            return -1;
        }
        int low=bloomDay[0];
        int high =bloomDay[0];

        for(int i:bloomDay){
            low = Math.min(low,i);
            high= Math.max(high,i);
        }

    while(low<=high){
        int mid =(low+high)/2;
        if(possible(bloomDay,mid,m,k)){
            high = mid-1;
        }else{
            low = mid+1;
        }
    }
    return low;


    }
}