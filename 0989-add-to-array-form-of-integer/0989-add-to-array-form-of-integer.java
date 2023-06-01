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
        String s = "";
        for(int i = 0 ; i<num.length ; i++){s = s+num[i];}
        for(int i = 0 ; i<s.length() ; i++){
            arr.add(s.charAt(i)-'0');
        }
        return arr;
    }
}