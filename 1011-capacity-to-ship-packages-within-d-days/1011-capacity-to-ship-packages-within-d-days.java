class Solution {
    public int possible(int []arr,int capacity){
        int load=0;
        int days=1;
        for(int i=0;i<arr.length;i++){
            if(load + arr[i] > capacity){
                days = days+1;
                load = arr[i];
            }else{
                load += arr[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
    int low=0;
    int high=0;

    for(int i:weights){
        low = Math.max(low,i);
        high += i;
    }
    while(low <= high ){
        int mid = (low+high)/2;
        int LCap = possible(weights,mid);
        if(LCap <= days){
            high = mid-1;
        }else{
            low = mid+1;
        }
    }
    return low;
    
    }
}