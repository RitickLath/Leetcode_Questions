class Solution {
    protected static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public boolean halvesAreAlike(String s) {
        int checkingHalves = 0;
        for(int i = 0, j = s.length() - 1; i < s.length() / 2; i++,j--){
            if(isVowel(s.charAt(i))) checkingHalves++;
            if(isVowel(s.charAt(j))) checkingHalves--;
        }
        return checkingHalves == 0;
    }
}