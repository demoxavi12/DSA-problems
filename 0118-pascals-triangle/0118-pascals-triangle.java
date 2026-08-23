class Solution {
    public List<Integer> generateR(int row){
     List<Integer> temp= new ArrayList<>();
        int val=1;
        temp.add(val);
        for(int j=1;j<row;j++){
            val = val*(row-j)/j;
            temp.add(val);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
       for(int i=1;i<=numRows;i++) {
         
        
        ans.add(generateR(i));
       }


        
        
        
        return ans;
    }
}