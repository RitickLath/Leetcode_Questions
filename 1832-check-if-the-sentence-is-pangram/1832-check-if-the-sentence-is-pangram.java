class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        
        Set<Character> set = new HashSet<>();
        for (int idx = 0; idx < n; idx++) {
            Character c = sentence.charAt(idx);
            set.add(c);
        }
        
        return set.size() == 26;
    }
}