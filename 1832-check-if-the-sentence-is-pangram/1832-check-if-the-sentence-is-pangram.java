class Solution {
    public boolean checkIfPangram(String sentence) {
        for( byte i = 97;i<=122;i++ ){
            if( sentence.indexOf( i ) == -1 ){
                return false;
            }
        }
        return true;
    }
}