package EveryDay;

import java.util.HashMap;

public class FindtheTownJudge997 {
    public static void main(String[] args) {
        int N = 4;
        int[][] trust = {{1, 3},{1, 4}, {2, 3},{2,4},{4,3}};
        System.out.println(findJudge(N, trust));
    }

    public static int findJudge(int N, int[][] trust) {
        if(N==1){
            return 1 ;
        }
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        HashMap<Integer, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            if (!hashMap1.containsKey(trust[i][1])) {
                hashMap1.put(trust[i][1], 1);
            } else {
                hashMap1.put(trust[i][1], hashMap1.get(trust[i][1]) + 1);
            }
            for (int j = 0; j < trust[i].length; j++) {
                if (!hashMap2.containsKey(trust[i][0])) {
                    hashMap2.put(trust[i][0], 1);
                } else {
                    hashMap2.put(trust[i][0], hashMap2.get(trust[i][0]) + 1);
                }
            }
        }
        for (int key1 : hashMap1.keySet()) {
            if (hashMap1.get(key1) == (N - 1) && !hashMap2.containsKey(key1)) {
                return key1;
            }
        }
        return -1;
    }
}
