class Solution {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        
        while(n>0){
            int rem = (n-1)%26;
            str.append((char)('A' + rem));
            n = (n-1)/26;
        }
        
        str.reverse();
        return str.toString();
    }
}