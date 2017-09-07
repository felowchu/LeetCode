package DynamicProgram;

public class OJ070_ClimbingStairs {
    public int climb(int n){
        if(n <= 0) return 0;
        int bef = 1;
        int aft = 2;
        while(--n > 0){
            aft += bef;
            bef = aft - bef;
        }
        return bef;
    }
}
