package EveryDay;

public class SearchA2DMatrix74 {
    public static void main(String[] args) {
        int [] [] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int cow = 0;
        int row = matrix[cow].length-1;
        while(cow <= matrix.length-1 && row >= 0 ){
            if (matrix[cow][row] > target){
                row--;
            }else
            if (matrix[cow][row] < target){
                cow++;
            }else
            if (matrix[cow][row] == target){
                return true;
            }
        }
        return false;
    }
}
