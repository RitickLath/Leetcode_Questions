class Solution {
    public String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();

        for(int i = 0 ; i<s.length() ; i++){
            if((int)s.charAt(i)>=65 && (int)s.charAt(i)<=90){
                str.append((char)('a'+(s.charAt(i)-'A')));
            }
            else{
                str.append(s.charAt(i));
            }
            
        }
        return str.toString();
    }
}