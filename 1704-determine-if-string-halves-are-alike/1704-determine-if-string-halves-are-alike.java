class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int a = 0;
        int b = 0;
        for(int i = 0 ; i<s.length()/2 ; i++){
            if(s.charAt(i)-'a'==0 || s.charAt(i)-'e'==0 || s.charAt(i)-'i'==0 || s.charAt(i)-'o'==0 || s.charAt(i)-'u'==0){
                a++;
            }
        }
        
        for(int i = s.length()/2 ; i<s.length() ; i++){
            if(s.charAt(i)-'a'==0 || s.charAt(i)-'e'==0 || s.charAt(i)-'i'==0 || s.charAt(i)-'o'==0 || s.charAt(i)-'u'==0){
                b++;
            }
        }
        
        return a==b;
    }
}