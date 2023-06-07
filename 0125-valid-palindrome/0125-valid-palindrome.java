public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        Character c[] = new Character[s.length()];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            if (Character.isLetterOrDigit(c[i])) {
                str.append(c[i]);
            }
        }

        s = str.toString();

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
