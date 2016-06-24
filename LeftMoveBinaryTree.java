
class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public Node(int data, Node a, Node b) {
		this.data = data;
		this.left = a;
		this.right = b;
	}
}

class LeftMoveBinaryTree {

	public static void main(String args[]) {
		// LeftMoveBinaryTree tree = new LeftMoveBinaryTree();
		Node a6 = new Node(6);
		Node a7 = new Node(7);
		Node a4 = new Node(4);
		a4.left = a6;
		a4.right = a7;
		Node a5 = new Node(5);
		Node a2 = new Node(2);
		a2.left = a4;
		a2.right = a5;
		Node a3 = new Node(3);
		Node a1 = new Node(1);
		a1.left = a2;
		a1.right = a3;
		printtree(a1);
		transformleft(a1);
		System.out.println("-------------------------------");
		printtree(a1);
	}

	public static void printtree(Node node) {
		if (node == null)
			return;
		else {
			if (node.left != null) {
				System.out.println(node.data + "   left    "+node.left.data);
				printtree(node.left);
			}
			if (node.right != null) {
				System.out.println(node.data + "   right    "+node.right.data);
				printtree(node.right);
			}
		}

	}

	public static void transformleft(Node node) {
		if (node.left.right == null) {
			node.left.right = node.right;
			node.right = null;
			return;
		} else {
			transformleft(node.left);
			node.left.right = node.right;
			node.right = null;
			return;
		}
	}
}
