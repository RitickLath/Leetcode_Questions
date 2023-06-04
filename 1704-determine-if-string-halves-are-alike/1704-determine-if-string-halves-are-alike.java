class Solution {
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
    public boolean halvesAreAlike(String s) {
        int c = 0;
        int mid = s.length() / 2;
        
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                if (i < mid) {
                    c++;
                } else {
                    c--;
                }
            }
        }
        
        return c == 0;
    }
}
