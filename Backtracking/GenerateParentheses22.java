package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backTrack(n, list, 0, 0, "");
        return list;
    }

    private static void backTrack(int n, List<String> list, int left, int right, String str) {
        if (right > left) {
            return;
        }
        if (left == right && right == n) {
            list.add(str);
            return;
        }
        if (left < n) {
            backTrack(n, list, left + 1, right, str + "(");
        }
        if (right < left) {
            backTrack(n, list, left, right + 1, str + ")");
        }
    }
}

