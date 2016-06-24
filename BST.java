class BST {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BST() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	/////////////////////////////////////////// MIN DIFF
	/////////////////////////////////////////// NODES////////////////////////////////////////////////////////////////////
	static int minDiff = Integer.MAX_VALUE;
	static Node previous;

	void mindifffunc(Node root) {
		if (root != null) {
			mindifffunc(root.left);
			if (previous != null && minDiff > root.key - previous.key) {
				minDiff = root.key - previous.key;
			}
			previous = root;
			mindifffunc(root.right);
		}
	}

	/////////////////////////////////////////// MAX ADDITION DEPTH WISE//////////////////////////////////////////
	static int maxadd(Node root){
		int left=0,right=0;
		if(root.left!=null){
			left = root.key + maxadd(root.left);
		}else{
			left = root.key;
		}
		if(root.right!=null){
			right= root.key +maxadd(root.right);
		}else{
			right=root.key;
		}
		
		return Math.max(left, right);
	}

	public static void main(String[] args) {
		BST tree = new BST();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(55);
		tree.insert(51);
		tree.insert(52);
		tree.insert(53);
		tree.insert(54);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.mindifffunc(tree.root);
		tree.inorder();
		System.out.println("-MIN DIFF BETWEEN TWO NODES-" + minDiff);
		System.out.println("-MAX ADDITION-" + maxadd(tree.root));
	}
}