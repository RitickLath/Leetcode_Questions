class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        
        for(int i = 0 ; i<nums.length ; i++){
            arr.add(nums[i]);
        }
        
        for(int i = 0 ; i<nums.length ; i++){
            if(!arr.contains(i+1)){
                return i+1;
            }
        }
        
        return nums.length +1;
    }
}