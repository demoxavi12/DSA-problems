class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
       for(int i=1;i<=numRows;i++) {

        List<Integer> temp= new ArrayList<>();
        int val=1;
        temp.add(val);
        for(int j=1;j<i;j++){
            val = val*(i-j)/j;
            temp.add(val);
        }
        ans.add(temp);
       }


        
        
        
        return ans;
    }
}