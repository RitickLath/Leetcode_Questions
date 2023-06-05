class Solution {
    public String reverseWords(String s) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i = s.length()-1 ; i>=0 ; i--){
            str.append(s.charAt(i));
        }
        
        String ss = str.toString();
        String[] arr = ss.split(" ");
        
        StringBuilder strr = new StringBuilder();
        
        for(int i = arr.length-1 ; i>=0 ; i--){
            strr.append(arr[i]);
            strr.append(" ");
        }
        
        return strr.toString().substring(0,s.length());
        
    }
}