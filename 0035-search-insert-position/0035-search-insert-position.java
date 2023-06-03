class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int last = nums.length-1;
        
        while(start<=last){
            int mid = (start+last)/2;
            
            if(nums[mid]<target){
                start = mid+1;    
            }
            else if(nums[mid]>target){
                last = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}