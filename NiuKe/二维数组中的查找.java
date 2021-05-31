package NiuKe;

public class 二维数组中的查找 {

    public static void main(String[] args) {
        int[][] array = {{1, 1}};
        System.out.println(Find(2, array));
    }

    public static boolean Find(int target, int[][] array) {
        if (array[0].length == 0) {
            return false;
        }
        if (array.length == 1) {
            for (int i = 0; i < array[0].length; i++) {
                if (array[0][i] == target) {
                    return true;
                }
            }
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while (true) {
            if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            } else if (array[i][j] == target) {
                return true;
            }
            if (i < 0 || j >= array[0].length || i >= array.length || j < 0) {
                break;
            }
        }
        return false;
    }
}
