class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i<s.length() ; i++){
            if(i+2<s.length() && s.charAt(i+2) == '#'){
                str.append((char)('a'+(s.charAt(i)-'0')*10 + (s.charAt(i+1)-'0') -1));
                i = i+2;
            }
            else{
                str.append((char)('a' + (s.charAt(i)-'0' -1)));
            }
        }
        return str.toString();
    }
}