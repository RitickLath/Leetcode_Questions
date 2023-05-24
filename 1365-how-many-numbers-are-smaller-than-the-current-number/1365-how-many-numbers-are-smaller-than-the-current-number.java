class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            arr.add(nums[i]);
        }
        Collections.sort(arr);
        for(int i = 0 ; i<nums.length ; i++){
            nums[i] = arr.indexOf(nums[i]);
        }
        return nums;
    }
}