class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int last = letters.length-1;
        
        while(start<=last){
            int mid = (start+last)/2;
            
            if(target < letters[mid]){
                last = mid-1;
            }
            else{
                start = mid + 1;
            }
            
        }
        return letters[start%letters.length];
    }
}