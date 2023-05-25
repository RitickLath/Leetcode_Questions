class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Integer> hh = new HashSet<>();
        for(int i = 0 ; i<sentence.length() ; i++){
           hh.add(sentence.charAt(i)-'a');
        }
        if(hh.size() == 26){return true;}
        else{return false;}
        
    }
}