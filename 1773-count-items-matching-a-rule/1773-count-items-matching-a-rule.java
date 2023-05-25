class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match;
        int count = 0;
        if(ruleKey.contains("type")){match = 0;}
        else if(ruleKey.contains("color")){match = 1;}
        else{match = 2;}
        
        for(int i = 0 ; i<items.size() ; i++){
            if(items.get(i).get(match).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}