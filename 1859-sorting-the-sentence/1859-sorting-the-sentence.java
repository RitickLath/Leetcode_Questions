class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String ar[] = new String[arr.length];
        StringBuilder str = new StringBuilder();
        
        for(int i = 0 ; i<arr.length ; i++){
            int num = arr[i].charAt(arr[i].length()-1) - '0' - 1;
            
            ar[num] = arr[i].substring(0,arr[i].length()-1);
        }
        
        for(int i = 0 ; i<ar.length ; i++){
            str.append(ar[i]);
            str.append(" ");
        }
        String ss = str.toString();
        return ss.substring(0,ss.length()-1);
    }
}