package ClassT;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeDemo {

    public static void main(String[] args) {
        int [] [] inervals = {{1,4},{4,5}};
        int [] [] result = merge(inervals);
        System.out.println(Arrays.toString(result));
    }
    public static int[][] merge(int[][] inervals) {
        ArrayList<int[]> result = new ArrayList<>();

        //对给定的二维数组排序
        Arrays.sort(inervals, (a, b) -> a[0] - b[0]);

        for (int[] inerval : inervals) {
            if (result.size()==0||inerval[0]>result.get(result.size()-1)[1]){
                result.add(inerval);
            }else{
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1],inerval[1]);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
