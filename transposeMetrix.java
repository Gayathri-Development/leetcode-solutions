/***

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]


Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


***/


class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int[][] result = new int[columns][rows];
        
        for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
                
                result[column][row] = matrix[row][column];
    
			}
		}
        
        return result;
        
    }
}
