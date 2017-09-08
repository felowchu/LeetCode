package DynamicProgram;

import java.util.List;

public class OJ120_Triangle {
    public int minTrace(List<List<Integer>> triangle){
        int n = triangle.size();
        int[] dp = new int[n];
        for(int i = 0; i < triangle.get(n-1).size(); i++){
            dp[i] = triangle.get(n-1).get(i);
        }
        for(int i = n-2; i >= 0; i--){
            List<Integer> list = triangle.get(i);
            for(int j = 0; j < list.size(); j++){
               dp[j] = Math.min(dp[j], dp[j+1])+list.get(j);
            }
        }
        return dp[0];
    }
}
