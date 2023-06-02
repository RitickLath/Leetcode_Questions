class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hh = new HashMap<>();
        
        for(int i = 0 ; i<nums.length ; i++){
            hh.put(i , nums[i]);
        }
        
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(hh.get(j) == target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }
}