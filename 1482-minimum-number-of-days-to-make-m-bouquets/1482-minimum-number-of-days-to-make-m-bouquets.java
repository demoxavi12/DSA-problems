class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        // m * n = flowers. 
        if((long) m * k > bloomDay.length){
            return -1; 
        }

        int low = 1;
        int high = 0; 

        for(int bloom : bloomDay){
            high = Math.max(bloom, high);
        }

        while(high >= low){
            int mid = low + (high - low) / 2; 

            int boquet = 0; 
            int adjacent = 0; 

            for(int bloom : bloomDay){
                if(bloom <= mid){
                    adjacent++;

                    if(adjacent == k){
                        boquet++;
                        adjacent = 0; 
                    }
                } else {
                    adjacent = 0; 
                }
            }

            if(boquet >= m){
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return low; 
    }
}