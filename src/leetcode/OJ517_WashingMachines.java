package leetcode;

public class OJ517_WashingMachines {
    public int findMinMoves(int[] machines){
        int sum = 0;
        for(int i = 0; i < machines.length; i++){
            sum += machines[i];
        }
        if(sum % machines.length != 0) return -1;
        int avg = sum/machines.length;
        int cnt = 0, max = 0;
        for(int i = 0; i < machines.length; i++){
            cnt += machines[i] - avg;
            max = Math.max(Math.max(max, Math.abs(cnt)), machines[i] - avg);
        }
        return max;
    }
}
