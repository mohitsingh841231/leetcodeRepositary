class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n[][]=  new int [m][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                n[j][m-1-i] = matrix[i][j];

            }

        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = n[i][j];
            }
        }
    }
}