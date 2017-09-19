package leetcode;

public class OJ071_SimplifyPath {
    public static void main(String[] args){
        System.out.println(simplifyPath("///"));
    }
    public static String simplifyPath(String path){
        if(path.length() == 0) return "";
        if(path.equals("/")) return path;
        while (path.length() > 0 && path.charAt(path.length()-1) == '/'){
            path = path.substring(0, path.length()-1);
        }
        int index = path.lastIndexOf('/');
        return path.substring(index);
    }
}
