import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();
        int n = num.length - 1;
        int carry = 0;

        while (n >= 0 || k > 0 || carry > 0) {
            int digit = carry;
            
            if (n >= 0)
                digit += num[n];
            
            if (k > 0) {
                digit += k % 10;
                k /= 10;
            }
            
            arr.add(0, digit % 10);
            carry = digit / 10;
            n--;
        }
        
        return arr;
    }
}
