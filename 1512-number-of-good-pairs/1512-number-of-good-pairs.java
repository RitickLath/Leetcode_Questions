class Solution {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> hh = new HashMap<>();

        for(int i = 0; i<nums.length ; i++){
            int j = hh.getOrDefault(nums[i] , 0);
            count = count + j;
            hh.put(nums[i] , j+ 1);
        }

        return count;
    }
}