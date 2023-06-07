class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i) - 'a' >=0 && s.charAt(i) - 'a'<26){
                str.append(s.charAt(i));
            }
            if(s.charAt(i)-'0' >=0 && s.charAt(i)-'0' <=9){
                str.append(s.charAt(i));
            }
        }
        
        s = str.toString();
        
        for(int i = 0 ; i<s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }
        
        return true;
    }
}