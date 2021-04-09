package EveryDay;

public class SearchA2DMatrixII240 {
    public static void main(String[] args) {
        int [] [] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[i].length-1;
        while(j >=0 && i<= matrix.length-1){
            if(matrix[i][j] > target){
                j--;
            }else if(matrix[i][j] < target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
