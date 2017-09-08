package DynamicProgram;

import java.util.ArrayList;
import java.util.List;

public class OJ095_UniqueBinarySearchTreesII {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
    }

    public List<TreeNode> generateTrees(int n){
        if(n <= 0) return new ArrayList<>();
        return find(1, n);
    }

    public List<TreeNode> find(int start, int end){
        List<TreeNode> list = new ArrayList<>();
        if(start > end){
            list.add(null);
            return list;
        }
        if(start == end) {
            list.add(new TreeNode(start));
            return list;
        }
        for(int i = start; i <= end; i++){
            List<TreeNode> left = find(start, i-1);
            List<TreeNode> right = find(i+1, end);
            for(int l = 0; l < left.size(); l++){
                for(int r = 0; r < right.size(); r++){
                    TreeNode root = new TreeNode(i);
                    root.left = left.get(l);
                    root.right = right.get(r);
                    list.add(root);
                }
            }
        }
        return list;
    }
}
