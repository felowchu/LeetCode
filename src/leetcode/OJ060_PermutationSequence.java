package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OJ060_PermutationSequence {
    public static void main(String[] args){
        System.out.println(getPermutation(5 ,37));
    }
    public static String getPermutation(int n, int k){
        if(n < 1) return "";
        int sum = 1;
        for(int i = 2; i <= n; i++) sum *= i;
        if(k > sum) return "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) list.add(i);
        String s = "";
        while (n > 1 && k > 0){
            int gap = sum / n;
            int temp = k / gap;
            int index = (k % gap == 0 ? temp : temp + 1);
            s += list.remove(index-1);
            k -= temp * gap;
            sum /= n;
            n--;
        }
        for(int i = list.size()-1; i >= 0; i--) s += list.get(i);
        return s;
    }
}
