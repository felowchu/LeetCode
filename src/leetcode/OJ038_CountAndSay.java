package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class OJ038_CountAndSay {
    public static void main(String[] args){
        System.out.println(countAndSay(5));
    }
    public static String countAndSay(int n){
        if(n < 1) return null;
       ArrayList<String > list = new ArrayList<String >();
        list.add("1");
        for(int i = 1;  i < n; i++){
            ArrayList<String> temp = new ArrayList<String>();
            String str = list.get(0);
            int index = 0;
            int count = 0;
            while(index < list.size()){
                String str1 = list.get(index);
                if(str1.equals(str))
                    count++;
                else {
                    temp.add(String.valueOf(count));
                    temp.add(str);
                    str = str1;
                    count = 1;
                }
                index++;
            }
            temp.add(String.valueOf(count));
            temp.add(str);
            list = temp;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.toString();
        StringBuilder
    }
}
