package NiuKe;

public class 最长回文串 {
    /*
    中心扩散法
     */
    public static void main(String[] args) {

    }

    public static int getLongestPalindrome(String A, int n) {
        // write code here
        if (n < 2) {
            return n;
        }
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < n; ) {
            if (n - i <= maxLen / 2) {
                break;
            }
            int left = i;
            int right = i;
            while (right < n - 1 && A.charAt(right + 1) == A.charAt(right)) {
                ++right;
            }
            i = right + 1;
            while (right < n - 1 && left > 0 && A.charAt(right + 1) == A.charAt(left - 1)) {
                ++right;
                --left;
            }
            if (right - left + 1 > maxLen) {
                start = left;
                maxLen = right - left + 1;
            }
        }
        return maxLen;
    }
}
