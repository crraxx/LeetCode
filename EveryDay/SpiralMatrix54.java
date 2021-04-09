package EveryDay;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int rows = matrix.length;
        int colimes = matrix[0].length;
        int left = 0, right = colimes - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int colume = left; colume <= right; colume++) {
                list.add(matrix[top][colume]);
            }
            for (int row = top + 1; row <= bottom; row++) {
                list.add(matrix[row][right]);
            }
            if (left < right && top < bottom) {
                for (int colume = right - 1; colume > left; colume--) {
                    list.add(matrix[bottom][colume]);
                }
                for (int row = bottom; row > top; row--) {
                    list.add(matrix[row][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return list;
    }
}
