class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int a: nums){
            if((a>9 && a<100) || (a>999 && a<10000) || a == 100000) count++;
        }
        return count;
    }
}

