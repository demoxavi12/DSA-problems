class Solution {
    public int calculateDay(String day,int []prefixSum){
         int month = Integer.parseInt(day.substring(0, 2));
         int date = Integer.parseInt(day.substring(3));

         return prefixSum[month-1]+date;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int prefixSum[]=new int[13];

        for(int i=0;i<12;i++){
            prefixSum[i+1]= prefixSum[i]+days[i];
        }
        int arriveAliceDay = calculateDay(arriveAlice,prefixSum);
        int arriveBobDay = calculateDay(arriveBob,prefixSum);
        int leaveAliceDay = calculateDay(leaveAlice,prefixSum);
        int leaveBobDay = calculateDay(leaveBob,prefixSum);

        return Math.max(0,Math.min(leaveAliceDay,leaveBobDay)-Math.max(arriveBobDay,arriveAliceDay)+1);
    }
}