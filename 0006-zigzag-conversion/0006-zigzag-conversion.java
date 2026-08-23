class Solution {
    public String convert(String s, int numRows) {
       if(numRows == 1 || numRows >= s.length()) return s;
       int n = numRows;
       int m = s.length();
       char[][] grid = new char[n][m];
        int row =0,col = 0;
        Boolean goingDown = false;
       for(int i = 0;i<m;i++){
        grid[row][col] = s.charAt(i);
        if(goingDown){
            if(row == n-1){
                row--;
                col++;
                goingDown = false;
            }else{
                row++;
            }
        }else{
            if(row==0){
                row++;
                goingDown = true;
            }else{
            row--;
            col++;
            }
        }
       }
       StringBuilder result = new StringBuilder();

       for(int i = 0;i<n;i++){
        for(int  j = 0;j<m;j++){
            if(grid[i][j] != '\0'){
                result.append(grid[i][j]);
            }
        }
       }
       return result.toString();
    }
}