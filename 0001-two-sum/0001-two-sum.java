import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = arr.get(i);
            arr.remove(i);
            if (arr.contains(target - num)) {
                int index = arr.indexOf(target - num);
                if (index >= i) {
                    index++; // Adjust index if it is greater than or equal to i
                }
                return new int[]{i, index};
            }
            arr.add(i, num); // Add the element back at the same index
        }

        return new int[]{1, 1};
    }
}
