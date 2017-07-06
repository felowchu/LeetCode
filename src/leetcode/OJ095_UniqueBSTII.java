package leetcode;

import java.util.LinkedList;
import java.util.List;

public class OJ095_UniqueBSTII {
	public class TreeNode{
		int val;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode(int val){
			this.val = val;
		}
	}
	public List<TreeNode> generateTrees(int n){
		if(n <= 0)
			return new LinkedList<TreeNode>();
		return generateCore(1,n);
	}
	public List<TreeNode> generateCore(int start, int end){
		List<TreeNode> list = new LinkedList<TreeNode>();
		if(start > end){
			list.add(null);
			return list;
		}
		if(start == end){
			list.add(new TreeNode(start));
			return list;
		}
		for(int i = start; i <= end; i++){
			List<TreeNode> left = generateCore(start, i - 1);
			List<TreeNode> right = generateCore(i + 1, end);
			for(TreeNode leftNode : left){
				for(TreeNode rightNode : right){
					TreeNode root = new TreeNode(i);
					root.left = leftNode;
					root.right = rightNode;
					list.add(root);
				}
			}
		}
		return list;
	}
}
