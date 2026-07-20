class Solution {
    public void rotate(int[][] matrix) {
        for(int r=0;r<matrix.length-1;r++){
            for(int c=r+1;c<matrix[0].length;c++){
                int temp=matrix[r][c];
                matrix[r][c]=matrix[c][r];
                matrix[c][r]=temp;
            }
        }
    for (int i = 0; i < matrix.length; i++) {
    int l = 0, r = matrix.length-1 ;
    while (l < r) {
        int temp = matrix[i][l];
        matrix[i][l] = matrix[i][r];
        matrix[i][r] = temp;
        l++;
        r--;
    }
}
    }
}