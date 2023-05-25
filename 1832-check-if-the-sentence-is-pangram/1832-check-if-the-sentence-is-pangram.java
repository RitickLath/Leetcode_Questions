class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){return false;}
        int arr[] = new int[26];
        for(int i = 0 ; i<sentence.length() ; i++){
            arr[sentence.charAt(i)-'a'] = 1;
        }
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] != 1){
                return false;
            }
        }
        return true;
    }
}