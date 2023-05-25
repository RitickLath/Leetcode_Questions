class Solution {
    public boolean checkIfPangram(String sentence) {
        for(int i = 0 ; i<26 ; i++){
            if(sentence.indexOf('a'+i) == -1){
                return false;
            }
        }
        return true;
    }
}