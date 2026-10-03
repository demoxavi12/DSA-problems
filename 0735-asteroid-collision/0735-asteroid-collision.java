class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : asteroids) {

            if (num > 0) {
                list.add(num);
            } 
            else {

                while (!list.isEmpty() &&
                       list.get(list.size() - 1) > 0 &&
                       list.get(list.size() - 1) < Math.abs(num)) {

                    list.remove(list.size() - 1);
                }

                if (!list.isEmpty() &&
                    list.get(list.size() - 1) == Math.abs(num)) {

                    list.remove(list.size() - 1);
                } 
                else if (list.isEmpty() ||
                         list.get(list.size() - 1) < 0) {

                    list.add(num);
                }
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}