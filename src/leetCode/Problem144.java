package leetCode;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class Problem144 {
	public static List<Integer> helperMethod(TreeNode root, List<Integer> list) {
		if (root == null) {
			return list;
		}
		list.add(root.val);
		helperMethod(root.left, list);
		helperMethod(root.right, list);
		return list;
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		return helperMethod(root, list);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
        
	}

}
