class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=matrix[j][i];
                
            }
        }
       //System.out.print(Arrays.deepToString(mat));
       for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp=mat[i][j];
            mat[i][j]=mat[i][n-1-j];
            mat[i][n-1-j]=temp;
        }
       }
        System.out.print(Arrays.deepToString(mat));

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][i]=mat[j][i];
                
            }
        }
      
    }
}