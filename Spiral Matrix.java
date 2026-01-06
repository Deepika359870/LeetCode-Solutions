class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int i;
        ArrayList<Integer> res = new ArrayList<>();
        while(left <=right && top <= bottom){
            for(i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;
            for(i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;  
    }
}