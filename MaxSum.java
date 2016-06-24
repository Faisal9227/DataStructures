
class Node {
	int data;
	Node left = null;
	Node right = null;

	public Node(int data) {
		this.data = data;
	}
}

public class MaxSum {

	public static void main(String args[]) {

		Node n1 = new Node(3);
		Node n2 = new Node(9);
		Node n3 = new Node(4);
		Node n4 = new Node(1);
		Node n5 = new Node(8);
		Node n6 = new Node(2);
		Node n7 = new Node(4);
		Node n8 = new Node(5);
		Node n9 = new Node(8);
		Node n10 = new Node(2);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n4.left = n7;
		n4.right = n8;
		n5.left = n9;
		n5.right = n10;

		System.out.println(calculatemaxsum(n1));

	}

	private static int calculatemaxsum(Node node) {

		if (node == null) {
			return 0;
		} else
			return node.data + Math.max(calculatemaxsum(node.left), calculatemaxsum(node.right));
	}

}
