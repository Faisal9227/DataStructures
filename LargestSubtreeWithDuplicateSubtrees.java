
public class LargestSubtreeWithDuplicateSubtrees {

	public static void main(String[] args) {

		Node n2a = new Node(1);
		Node n2b = new Node(3);
		Node n2c = new Node(1);
		Node n2d = new Node(3);

		Node n1a = new Node(2, n2a, n2b);
		Node n1b = new Node(2, n2c, n2d);

		Node n0 = new Node(4, n1a, n1b);

		System.out.println(maxDuplicateSubtree(n0, new StringBuilder(), 0));

	}

	public static int maxDuplicateSubtree(Node root, StringBuilder path, int maxSubtree) {
		if (root == null) {
			return 0;
		}
		StringBuilder leftPath = new StringBuilder();
		StringBuilder rightPath = new StringBuilder();
		int max = 0;
		int maxLeft = maxDuplicateSubtree(root.left, leftPath, maxSubtree);

		path.append(leftPath).append(root.data);

		int maxRight = maxDuplicateSubtree(root.right, rightPath, maxSubtree);
		max = Math.max(maxLeft, maxRight);

		path.append(rightPath);

		if (leftPath.toString().equals(rightPath.toString())) {
			max = Math.max(leftPath.length(), max);
		}
		maxSubtree = Math.max(max, maxSubtree);
		System.out.println(maxSubtree);
		return maxSubtree;
	}

}
