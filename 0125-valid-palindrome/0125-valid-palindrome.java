class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        
        while(start <= end){
            
            char f = s.charAt(start);
            char l = s.charAt(end);
            
            if(!Character.isLetterOrDigit(f)){
                start++;
            }
            else if(!Character.isLetterOrDigit(l)){
                end--;
            }
            else{
                if(f != l){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
        
    }
}