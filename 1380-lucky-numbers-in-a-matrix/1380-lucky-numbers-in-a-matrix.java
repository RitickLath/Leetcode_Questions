class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i<matrix.length ; i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int col =0;
            // finding col to look for
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    col = j;
                }    
            }
            
            // finding max in col
            for(int k = 0 ; k<matrix.length ; k++){
                if(matrix[k][col]>max){
                    max = matrix[k][col];
                }
            }
            
            if(max == min){arr.add(min);}
        }
        
        return arr;
    }
}