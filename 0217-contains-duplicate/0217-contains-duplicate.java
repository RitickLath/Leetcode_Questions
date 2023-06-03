class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Arrays.sort(nums);
        HashMap<Integer , Integer> arr = new HashMap<>();
        
        for(int i = 0 ; i<nums.length ; i++){
            if(arr.containsKey(nums[i])){
                return true;
            }
            arr.put(nums[i],0);
        }
        return false;
    }
}