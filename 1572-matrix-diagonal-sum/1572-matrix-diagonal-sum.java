class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int j = 0;
        int k = mat.length-1;
        
        for(int i = 0 ; i<mat.length ; i++){
            sum = sum + mat[i][j] + mat[i][k];
            j++;
            k--;
            
        }
        if(( mat.length+1)%2==0){
            sum = sum - mat[ mat.length/2][ mat.length/2];
        }
        return sum;
        
    }
}