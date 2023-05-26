class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = 0;
        int k = mat.length-1;
        int n = mat.length;
        for(int i = 0 ; i<mat.length ; i++){
            sum = sum + mat[i][j] + mat[i][k];
            j++;
            k--;
            
        }
        if((n+1)%2==0){
            sum = sum - mat[n/2][n/2];
        }
        return sum;
        
    }
}