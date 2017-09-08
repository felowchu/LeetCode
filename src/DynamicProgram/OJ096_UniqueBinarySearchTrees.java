package DynamicProgram;

import java.util.Arrays;

public class OJ096_UniqueBinarySearchTrees {
    public static void main(String[] args){
        System.out.println(numTrees(3));
    }
    public static int numTrees(int n){
        if(n <= 0) return 0;
        int[] cache = new int[n+1];
        Arrays.fill(cache, -1);
        cache[0] = 1; cache[1] = 1;
        return count(n, cache);
    }

    public static int count(int n, int[] cache){
        if(cache[n] != -1) return cache[n];
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += (count(i-1, cache) * count(n-i, cache));
        }
        cache[n] = res;
        return res;
    }
}
