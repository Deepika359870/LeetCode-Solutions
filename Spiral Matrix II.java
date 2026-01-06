class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int left = 0;
        int right = n - 1;
        int bottom = n - 1;
        int top = 0;
        int count = 1;
        int i;
        while(count <=n*n){
            for(i=left;i <=right;i++){
                mat[top][i] = count++;
            }
            top++;
            for(i=top;i<=bottom;i++){
                mat[i][right] = count++;
            }
            right--;
            if(top<=bottom){
                for(i=right;i>=left;i--){
                    mat[bottom][i]=count++;
                }
                bottom--;
            }
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    mat[i][left] = count++;
                }
                left++;
            }
        }
        return mat;
    }
}