class Solution {
    
    public static Boolean tru(char c){
        return c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u';
    }
    
    public boolean halvesAreAlike(String s) {
        int c = 0;
        s = s.toLowerCase();
        for(int i = 0 ; i<s.length() ; i++){
            if(tru(s.charAt(i))){
                if(i<s.length()/2){c++;}
                else{c--;}
                
            }
        }
        return c==0;
        
    }
}