package DynamicProgram;

public class OJ097_InterleavingString {
    public boolean isInterleaving(String s1, String s2, String s3){
        String str = s1 + s2;
        if(str.length() != s3.length()) return false;
        int[] chars = new int[26];
        for(int i = 0; i < str.length(); i++){
            chars[str.charAt(i)-'a']++;
            chars[s3.charAt(i)-'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(chars[i] != 0) return false;
        }
        int m = s1.length();
        int n = s2.length();
        if(m == 0 && n == 0 && s3.length() == 0) return true;
        boolean[][] dp = new boolean[m+1][n+1];
        for(int i = 1; i <= n; i++){
            if(s3.charAt(i-1) == s2.charAt(i-1))
                dp[0][i] = true;
            else break;
        }
        for(int i = 1; i <= m; i++){
            if(s3.charAt(i-1) == s1.charAt(i-1))
                dp[i][0] = true;
            else break;
        }
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = (s1.charAt(i-1) == s3.charAt(i+j-1) && dp[i-1][j]) || (s2.charAt(j-1) == s3.charAt(i+j-1) && dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
