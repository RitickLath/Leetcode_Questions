class Solution {
    public String reverseWords(String s) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i = s.length()-1 ; i>=0 ; i--){
            str.append(s.charAt(i));
        }
        
        String ss = str.toString();
        String[] arr = ss.split(" ");
        
        s = "";
        
        for(int i = arr.length-1 ; i>=0 ; i--){
            s = s + arr[i] + " ";
            
        }
        
        return s.substring(0,s.length()-1);
        
    }
}