class Solution {
    public void setZeroes(int[][] arr) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int n = arr.length;
        int m = arr[0].length;
        int idx1 = 0;
        int idx2 =0;

       for (int k = 0; k < row.size(); k++) {
            int r = row.get(k);
            int c = col.get(k);

            // Zero the row
            for (int j = 0; j < m; j++) {
                arr[r][j] = 0;
            }

            // Zero the column
            for (int i = 0; i < n; i++) {
                arr[i][c] = 0;
            }
        }
      
    }
}