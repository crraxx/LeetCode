package Array;

import java.util.Arrays;

public class SubrectangleQueries1476 {

    private int[][] rectangle;

    public SubrectangleQueries1476(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public static void main(String[] args) {
        int [] [] a = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        SubrectangleQueries1476 s = new SubrectangleQueries1476(a);
        s.updateSubrectangle(0,0,3,2,5);
        int w = s.getValue(0,2);
        System.out.println(w);
    }

    public  void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1;i<=row2;i++){
            for(int j = col1;j<=col2;j++){
                rectangle[i][j] = newValue;
            }
        }
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.println(Arrays.toString(rectangle[j]));
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }
}
