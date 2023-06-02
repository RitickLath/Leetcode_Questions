class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int k = 1;
        if(n%2==0){
            for(int i = 0 ; i<n/2 ; i++){
                arr[i] = k;
                arr[n-1-i] = -1*k;
                k++;
            }
        }
        
        else{
            for(int i = 0 ; i<n/2 ; i++){
                arr[i] = k;
                arr[n-1-i] = -1*k;
                k++;
            }
            arr[n/2] = 0;
        }
        return arr;
    }
}