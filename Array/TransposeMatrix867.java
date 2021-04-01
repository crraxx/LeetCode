package Array;

import java.util.Arrays;

public class TransposeMatrix867 {

    public static void main(String[] args) {
        int [] [] A = {{1,2,3},{4,5,6}};
        int [] [] B = transpose(A);
        for (int i = 0; i < B.length; i++) {
            System.out.println(Arrays.toString(B[i]));
        }
    }
    public static  int[][] transpose(int[][] A) {
        int [] [] B = new int [A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[j][i]=A[i][j];
            }
        }
        return B;
    }
}
