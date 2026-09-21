class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;

        char ch=letters[0];

        while(low<=high){
            int mid= (low+high)/2;
            if(letters[mid] > target){
                ch = letters[mid];
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ch;
    }
}