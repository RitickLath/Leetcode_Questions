class Solution {
    
    public String ss(String str){
        StringBuilder s = new StringBuilder();
        for(int i = str.length()-1 ; i>=0 ; i--){
            s.append(str.charAt(i));
        }
        
        return s.toString();
    }
    
    
    public String reverseWords(String s) {
        String st[] = s.split(" ");
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i<st.length ; i++){
            str.append(ss(st[i]));
            str.append(" ");
        }
        
        return str.toString().substring(0,s.length());
    }
}