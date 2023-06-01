class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = num.length-1;
        int sum;
        for(int i = 0 ; i<num.length ; i++){
            sum = num[n] + k;
            if(n==0){num[n] = sum;break;}
            else{num[n] = sum%10;}
            n--;
            k = sum/10;
        }
        
        for(int i = 0 ; i<num.length ; i++){
            String s = "" + num[i];
            for(int j = 0 ; j<s.length() ; j++){
                arr.add(s.charAt(j)-'0');
            }
        }
        return arr;
    }
}