package EveryDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixII59 {
    public static void main(String[] args) {
        for (int[] num:spiralOrder(3)) {
            System.out.println(Arrays.toString(num));
        }

    }

    public static int[][] spiralOrder(int n) {

        int[][] matrix = new int[n][n];
        int rows = matrix.length;
        int colimes = matrix[0].length;
        int index = 1;
        int left = 0, right = colimes - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {

            for (int colume = left; colume <= right; colume++) {
                matrix[top][colume] = index;
                index++;
            }
            for (int row = top + 1; row <= bottom; row++) {
                matrix[row][right]= index;
                index++;
            }
            if (left < right && top < bottom) {
                for (int colume = right - 1; colume > left; colume--) {
                    matrix[bottom][colume]= index;
                    index++;
                }
                for (int row = bottom; row > top; row--) {
                    matrix[row][left]= index;
                    index++;
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return matrix;
    }
}
