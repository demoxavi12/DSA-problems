class Solution {
    
    public int shipWithinDays(int[] weights, int days) {
    int low=0;
    int high=0;

    for(int i:weights){
        low = Math.max(low,i);
        high += i;
    }

    while(low <= high ){
      int ReqDays=1;
      int load =0;
      int mid =(low+high)/2;
      for(int weight:weights)
        {
            if(load + weight > mid){
                ReqDays += 1;
                load = weight;
            }else{
                load += weight;
            }
        }
        if(ReqDays<=days){
            high = mid-1;
        }else{
            low = mid+1;
        }
    }


    return low;
    
    }
}