class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int length = nums.length;

        int[] result = new int[length];

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 2 * length - 1; i > -1; i--){

            while(!stack.isEmpty() && stack.peek() <= nums[i % length]){
                stack.pop();
            }

            if(i < length){
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(nums[i % length]);
        }

        return result;

    }
}