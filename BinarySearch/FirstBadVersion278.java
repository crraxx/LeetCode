package BinarySearch;

public class FirstBadVersion278 {

    boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int left = 1 ;
        int right = n;
        int mid;
        while (left<right){
            mid = left+(right-left)/2;
            if (isBadVersion(mid) ){
                right = mid ;
            }else {
                left = mid +1 ;
            }
        }
        return left;
    }

/*    public int firstBadVersion(int n) {
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)){
                return i;
            }
        }
        return n;
    }*/
}
