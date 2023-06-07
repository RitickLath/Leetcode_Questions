class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            }
        }
        
        if(s.length() == 1){return true;}
        
        s = str.toString();
        
        for(int i = 0 ; i<s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        
        return true;
    }
}