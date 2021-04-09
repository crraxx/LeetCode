package EveryDay;

import java.util.Arrays;

public class SetMatrixZeroes73 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1},{1,1,1},{1,1,1}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(setZeroes(matrix)[i]));
        }
    }
    public static int[][] setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] cols = new boolean[m];
        boolean[] rows = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0){
                    cols[i] = rows[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (cols[i] || rows[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
